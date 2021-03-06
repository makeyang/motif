/*
 * Copyright (C) 2015 John Leacox
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.leacox.motif.matching;

import com.leacox.motif.MatchException;
import com.leacox.motif.MatchesAny;
import com.leacox.motif.MatchesExact;
import com.leacox.motif.extract.DecomposableMatchBuilder0;
import com.leacox.motif.extract.DecomposableMatchBuilder1;
import com.leacox.motif.extract.DecomposableMatchBuilder2;
import com.leacox.motif.extract.DecomposableMatchBuilder3;
import com.leacox.motif.extract.matchers.ArgumentMatchers;
import com.leacox.motif.extract.matchers.Matcher;
import com.leacox.motif.extract.util.Lists;
import com.leacox.motif.function.Consumer0;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Fluent matching for actions with a void type.
 *
 * @author John Leacox
 */
public final class FluentMatchingC<T> {
  private final T value;
  private final List<ConsumablePattern<T>> patterns = new ArrayList<>();

  FluentMatchingC(T value) {
    this.value = value;
  }

  void addPattern(ConsumablePattern<T> pattern) {
    patterns.add(pattern);
  }

  /**
   * Specifies an exact match and then returns a fluent interface for specifying the action to take
   * if the value matches this case.
   */
  public <U extends T> OngoingMatchingC0<T, U> when(MatchesExact<U> o) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(o.t));
    return new OngoingMatchingC0<>(
        this, new DecomposableMatchBuilder0<>(matchers, new IdentityFieldExtractor<U>()).build());
  }

  /**
   * Specifies a wildcard match and then returns a fluent interface for specifying the action to
   * take if the value matches this case.
   */
  public <U extends T> OngoingMatchingC1<T, U, U> when(MatchesAny<U> o) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any());
    return new OngoingMatchingC1<>(
        this,
        new DecomposableMatchBuilder1<U, U>(matchers, 0, new IdentityFieldExtractor<>()).build());
  }

  /**
   * Specifies an match on a decomposing matcher with 0 extracted fields and then returns a fluent
   * interface for specifying the action to take if the value matches this case.
   */
  public <U extends T> OngoingMatchingC0<T, U> when(
      DecomposableMatchBuilder0<U> decomposableMatchBuilder) {
    return new OngoingMatchingC0<>(this, decomposableMatchBuilder.build());
  }

  /**
   * Specifies an match on a decomposing matcher with 1 extracted fields and then returns a fluent
   * interface for specifying the action to take if the value matches this case.
   */
  public <U extends T, A> OngoingMatchingC1<T, U, A> when(
      DecomposableMatchBuilder1<U, A> decomposableMatchBuilder) {
    return new OngoingMatchingC1<>(this, decomposableMatchBuilder.build());
  }

  /**
   * Specifies an match on a decomposing matcher with 2 extracted fields and then returns a fluent
   * interface for specifying the action to take if the value matches this case.
   */
  public <U extends T, A, B> OngoingMatchingC2<T, U, A, B> when(
      DecomposableMatchBuilder2<U, A, B> decomposableMatchBuilder) {
    return new OngoingMatchingC2<>(this, decomposableMatchBuilder.build());
  }

  /**
   * Specifies an match on a decomposing matcher with 3 extracted fields and then returns a fluent
   * interface for specifying the action to take if the value matches this case.
   */
  public <U extends T, A, B, C> OngoingMatchingC3<T, U, A, B, C> when(
      DecomposableMatchBuilder3<U, A, B, C> decomposableMatchBuilder) {
    return new OngoingMatchingC3<>(this, decomposableMatchBuilder.build());
  }

  /**
   * Runs through the possible matches and executes the specified consumer of the first match.
   *
   * @throws MatchException if no match is found.
   */
  public void doMatch() {
    boolean matchFound = false;
    for (ConsumablePattern<T> pattern : patterns) {
      if (pattern.matches(value)) {
        pattern.consume(value);
        matchFound = true;
        break;
      }
    }

    if (!matchFound) {
      throw new MatchException("No match found for " + value);
    }
  }

  /**
   * Sets a {@link Consumer} to be run if no match is found.
   */
  public FluentMatchingC<T> orElse(Consumer<T> consumer) {
    patterns.add(ConsumablePattern.of(t -> true, consumer::accept));
    return this;
  }

  /**
   * Sets a {@link Consumer0} to be run if no match is found.
   */
  public FluentMatchingC<T> orElse(Consumer0 consumer) {
    patterns.add(ConsumablePattern.of(t -> true, t -> consumer.accept()));
    return this;
  }

  /**
   * Sets a no-op to be run if no match is found.
   *
   * <p>This can be used if you don't care if a match occurs and want to avoid the
   * {@link MatchException}.
   */
  public FluentMatchingC<T> orElse() {
    patterns.add(ConsumablePattern.of(t -> true, t -> doNothing()));
    return this;
  }

  private void doNothing() {
  }
}
