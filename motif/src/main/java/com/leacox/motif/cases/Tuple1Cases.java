// /*
//  * Copyright (C) 2015 John Leacox
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  * http://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */
//
// Generated by Motif. Do Not Edit!
//

package com.leacox.motif.cases;

import com.leacox.motif.MatchesAny;
import com.leacox.motif.MatchesExact;
import com.leacox.motif.extract.DecomposableMatchBuilder0;
import com.leacox.motif.extract.DecomposableMatchBuilder1;
import com.leacox.motif.extract.DecomposableMatchBuilder2;
import com.leacox.motif.extract.DecomposableMatchBuilder3;
import com.leacox.motif.extract.matchers.ArgumentMatchers;
import com.leacox.motif.extract.matchers.Matcher;
import com.leacox.motif.extract.util.Lists;
import com.leacox.motif.tuple.Tuple1;

import java.util.List;

/**
 * Motif cases for matching a {@link Tuple1}.
 */
public final class Tuple1Cases {
  private Tuple1Cases() {
  }

  /**
   * Matches a tuple of 1 element.
   */
  public static <A> DecomposableMatchBuilder0<Tuple1<A>> tuple1(MatchesExact<A> a) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t));
    return new DecomposableMatchBuilder0<Tuple1<A>>(matchers, new Tuple1FieldExtractor<>());
  }

  /**
   * Matches a tuple of 1 element.
   *
   * <p>If matched, the {@code a} value is extracted.
   */
  public static <A> DecomposableMatchBuilder1<Tuple1<A>, A> tuple1(MatchesAny<A> a) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple1<A>, A>(matchers, 0, new Tuple1FieldExtractor<>());
  }

  /**
   * Matches a tuple of 1 element.
   *
   * <p>If matched, the {@code a} value is decomposed to 0.
   */
  public static <A, EA extends A> DecomposableMatchBuilder0<Tuple1<A>> tuple1(
      DecomposableMatchBuilder0<EA> a) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple1<A>, EA>(matchers, 0, new Tuple1FieldExtractor<>())
        .decomposeFirst(a);
  }

  /**
   * Matches a tuple of 1 element.
   *
   * <p>If matched, the {@code a} value is decomposed to 1.
   */
  public static <A, EA extends A, A1> DecomposableMatchBuilder1<Tuple1<A>, A1> tuple1(
      DecomposableMatchBuilder1<EA, A1> a) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple1<A>, EA>(matchers, 0, new Tuple1FieldExtractor<>())
        .decomposeFirst(a);
  }

  /**
   * Matches a tuple of 1 element.
   *
   * <p>If matched, the {@code a} value is decomposed to 2.
   */
  public static <A, EA extends A, A1, A2> DecomposableMatchBuilder2<Tuple1<A>, A1, A2> tuple1(
      DecomposableMatchBuilder2<EA, A1, A2> a) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple1<A>, EA>(matchers, 0, new Tuple1FieldExtractor<>())
        .decomposeFirst(a);
  }

  /**
   * Matches a tuple of 1 element.
   *
   * <p>If matched, the {@code a} value is decomposed to 3.
   */
  public static <A, EA extends A, A1, A2, A3> DecomposableMatchBuilder3<Tuple1<A>, A1, A2, A3> tuple1(
      DecomposableMatchBuilder3<EA, A1, A2, A3> a) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple1<A>, EA>(matchers, 0, new Tuple1FieldExtractor<>())
        .decomposeFirst(a);
  }
}
