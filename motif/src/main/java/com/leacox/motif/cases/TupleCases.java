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
package com.leacox.motif.cases;

import static com.leacox.motif.extract.matchers.ArgumentMatchers.any;
import static com.leacox.motif.extract.matchers.ArgumentMatchers.eq;

import com.leacox.motif.MatchesAny;
import com.leacox.motif.extract.DecomposableMatchBuilder0;
import com.leacox.motif.extract.DecomposableMatchBuilder1;
import com.leacox.motif.extract.Extractor1;
import com.leacox.motif.extract.Extractor3;
import com.leacox.motif.extract.FieldExtractor;
import com.leacox.motif.extract.matchers.Matcher;
import com.leacox.motif.tuple.Tuple1;
import com.leacox.motif.tuple.Tuple3;
import com.leacox.motif.extract.util.Lists;

import java.util.List;
import java.util.Optional;

/**
 * @author John Leacox
 */
public final class TupleCases {
  private TupleCases() {
  }

  private static class Tuple1Extractor<A> implements Extractor1<Tuple1<A>, A> {
    @Override
    public Optional<A> unapply(Tuple1<A> tuple1) {
      return tuple1.first() == null ? Optional.empty() : Optional.ofNullable(tuple1.first());
    }

    @Override
    public Class<Tuple1> getExtractorClass() {
      return Tuple1.class;
    }
  }

  private static class Tuple1FieldExtractor<A> implements FieldExtractor<Tuple1<A>> {
    private final Tuple1Extractor<A> tuple1Extractor = new Tuple1Extractor<>();

    @Override
    public Optional<List<Object>> unapply(Tuple1<A> value) {
      Optional<A> opt = tuple1Extractor.unapply(value);
      if (!opt.isPresent()) {
        return Optional.empty();
      }

      return Optional.of(value.toList());
    }

    @Override
    public Class<?> getExtractorClass() {
      return tuple1Extractor.getExtractorClass();
    }
  }

  private static class Tuple3Extractor<A, B, C> implements Extractor3<Tuple3<A, B, C>, A, B, C> {
    @Override
    public Optional<Tuple3<A, B, C>> unapply(Tuple3<A, B, C> tuple3) {
      return Optional.ofNullable(tuple3);
    }

    @Override
    public Class<Tuple3> getExtractorClass() {
      return Tuple3.class;
    }
  }

  public static <A> DecomposableMatchBuilder0<Tuple1<A>> tuple1(A a) {
    List<Matcher<Object>> matchers = Lists.of(eq(a));

    return new DecomposableMatchBuilder0<>(matchers, new Tuple1FieldExtractor<>());
  }

  public static <A> DecomposableMatchBuilder1<Tuple1<A>, A> tuple1(MatchesAny a) {
    List<Matcher<Object>> matchers = Lists.of(any());

    return new DecomposableMatchBuilder1<>(matchers, 0, new Tuple1FieldExtractor<>());
  }

  //public static <A, B, C> MatchingExtractor3<Tuple3<A, B, C>, A, B, C> caseTuple3(
  //    Matcher<A> first, Matcher<B> second, Matcher<C> third) {
  //  return MatchingExtractor3.create(new Tuple3Extractor<>(), first, second, third);
  //}
}
