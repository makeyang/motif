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
import com.leacox.motif.tuple.Tuple2;

import java.util.List;

/**
 * Motif cases for matching a {@link Tuple2}.
 */
public final class Tuple2Cases {
  private Tuple2Cases() {
  }

  /**
   * Matches a tuple of 2 elements.
   */
  public static <A, B> DecomposableMatchBuilder0<Tuple2<A, B>> tuple2(
      MatchesExact<A> a, MatchesExact<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t), ArgumentMatchers.eq(b.t));
    return new DecomposableMatchBuilder0<Tuple2<A, B>>(matchers, new Tuple2FieldExtractor<>());
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code b} value is extracted.
   */
  public static <A, B> DecomposableMatchBuilder1<Tuple2<A, B>, B> tuple2(
      MatchesExact<A> a, MatchesAny<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t), ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple2<A, B>, B>(
        matchers, 1, new Tuple2FieldExtractor<>());
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code b} value is decomposed to 0.
   */
  public static <A, B, EB extends B> DecomposableMatchBuilder0<Tuple2<A, B>> tuple2(
      MatchesExact<A> a, DecomposableMatchBuilder0<EB> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t), ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EB>(
        matchers, 1, new Tuple2FieldExtractor<>()).decomposeFirst(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code b} value is decomposed to 1.
   */
  public static <A, B, EB extends B, B1> DecomposableMatchBuilder1<Tuple2<A, B>, B1> tuple2(
      MatchesExact<A> a, DecomposableMatchBuilder1<EB, B1> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t), ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EB>(
        matchers, 1, new Tuple2FieldExtractor<>()).decomposeFirst(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code b} value is decomposed to 2.
   */
  public static <A, B, EB extends B, B1, B2> DecomposableMatchBuilder2<Tuple2<A, B>, B1, B2> tuple2(
      MatchesExact<A> a, DecomposableMatchBuilder2<EB, B1, B2> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t), ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EB>(
        matchers, 1, new Tuple2FieldExtractor<>()).decomposeFirst(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code b} value is decomposed to 3.
   */
  public static <A, B, EB extends B, B1, B2, B3> DecomposableMatchBuilder3<Tuple2<A, B>, B1, B2, B3> tuple2(
      MatchesExact<A> a, DecomposableMatchBuilder3<EB, B1, B2, B3> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.eq(a.t), ArgumentMatchers.any());
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EB>(
        matchers, 1, new Tuple2FieldExtractor<>()).decomposeFirst(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is extracted.
   */
  public static <A, B> DecomposableMatchBuilder1<Tuple2<A, B>, A> tuple2(
      MatchesAny<A> a, MatchesExact<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.eq(b.t));
    return new DecomposableMatchBuilder1<Tuple2<A, B>, A>(
        matchers, 0, new Tuple2FieldExtractor<>());
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is extracted and the {@code b} value is extracted.
   */
  public static <A, B> DecomposableMatchBuilder2<Tuple2<A, B>, A, B> tuple2(
      MatchesAny<A> a, MatchesAny<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, A, B>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>());
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is extracted and the {@code b} value is decomposed to 0.
   */
  public static <A, B, EB extends B> DecomposableMatchBuilder1<Tuple2<A, B>, A> tuple2(
      MatchesAny<A> a, DecomposableMatchBuilder0<EB> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, A, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeSecond(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is extracted and the {@code b} value is decomposed to 1.
   */
  public static <A, B, EB extends B, B1> DecomposableMatchBuilder2<Tuple2<A, B>, A, B1> tuple2(
      MatchesAny<A> a, DecomposableMatchBuilder1<EB, B1> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, A, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeSecond(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is extracted and the {@code b} value is decomposed to 2.
   */
  public static <A, B, EB extends B, B1, B2> DecomposableMatchBuilder3<Tuple2<A, B>, A, B1, B2> tuple2(
      MatchesAny<A> a, DecomposableMatchBuilder2<EB, B1, B2> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, A, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeSecond(b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 0.
   */
  public static <A, B, EA extends A> DecomposableMatchBuilder0<Tuple2<A, B>> tuple2(
      DecomposableMatchBuilder0<EA> a, MatchesExact<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.eq(b.t));
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EA>(
        matchers, 0, new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 0 and the {@code b} value is extracted.
   */
  public static <A, B, EA extends A> DecomposableMatchBuilder1<Tuple2<A, B>, B> tuple2(
      DecomposableMatchBuilder0<EA> a, MatchesAny<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, B>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 0 and the {@code b} value is decomposed to 0.
   */
  public static <A, B, EA extends A, EB extends B> DecomposableMatchBuilder0<Tuple2<A, B>> tuple2(
      DecomposableMatchBuilder0<EA> a, DecomposableMatchBuilder0<EB> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 0 and the {@code b} value is decomposed to 1.
   */
  public static <A, B, EA extends A, EB extends B, B1> DecomposableMatchBuilder1<Tuple2<A, B>, B1> tuple2(
      DecomposableMatchBuilder0<EA> a, DecomposableMatchBuilder1<EB, B1> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 0 and the {@code b} value is decomposed to 2.
   */
  public static <A, B, EA extends A, EB extends B, B1, B2> DecomposableMatchBuilder2<Tuple2<A, B>, B1, B2> tuple2(
      DecomposableMatchBuilder0<EA> a, DecomposableMatchBuilder2<EB, B1, B2> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 0 and the {@code b} value is decomposed to 3.
   */
  public static <A, B, EA extends A, EB extends B, B1, B2, B3> DecomposableMatchBuilder3<Tuple2<A, B>, B1, B2, B3> tuple2(
      DecomposableMatchBuilder0<EA> a, DecomposableMatchBuilder3<EB, B1, B2, B3> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 1.
   */
  public static <A, B, EA extends A, A1> DecomposableMatchBuilder1<Tuple2<A, B>, A1> tuple2(
      DecomposableMatchBuilder1<EA, A1> a, MatchesExact<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.eq(b.t));
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EA>(
        matchers, 0, new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 1 and the {@code b} value is extracted.
   */
  public static <A, B, EA extends A, A1> DecomposableMatchBuilder2<Tuple2<A, B>, A1, B> tuple2(
      DecomposableMatchBuilder1<EA, A1> a, MatchesAny<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, B>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 1 and the {@code b} value is decomposed to 0.
   */
  public static <A, B, EA extends A, A1, EB extends B> DecomposableMatchBuilder1<Tuple2<A, B>, A1> tuple2(
      DecomposableMatchBuilder1<EA, A1> a, DecomposableMatchBuilder0<EB> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 1 and the {@code b} value is decomposed to 1.
   */
  public static <A, B, EA extends A, A1, EB extends B, B1> DecomposableMatchBuilder2<Tuple2<A, B>, A1, B1> tuple2(
      DecomposableMatchBuilder1<EA, A1> a, DecomposableMatchBuilder1<EB, B1> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 1 and the {@code b} value is decomposed to 2.
   */
  public static <A, B, EA extends A, A1, EB extends B, B1, B2> DecomposableMatchBuilder3<Tuple2<A, B>, A1, B1, B2> tuple2(
      DecomposableMatchBuilder1<EA, A1> a, DecomposableMatchBuilder2<EB, B1, B2> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 2.
   */
  public static <A, B, EA extends A, A1, A2> DecomposableMatchBuilder2<Tuple2<A, B>, A1, A2> tuple2(
      DecomposableMatchBuilder2<EA, A1, A2> a, MatchesExact<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.eq(b.t));
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EA>(
        matchers, 0, new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 2 and the {@code b} value is extracted.
   */
  public static <A, B, EA extends A, A1, A2> DecomposableMatchBuilder3<Tuple2<A, B>, A1, A2, B> tuple2(
      DecomposableMatchBuilder2<EA, A1, A2> a, MatchesAny<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, B>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 2 and the {@code b} value is decomposed to 0.
   */
  public static <A, B, EA extends A, A1, A2, EB extends B> DecomposableMatchBuilder2<Tuple2<A, B>, A1, A2> tuple2(
      DecomposableMatchBuilder2<EA, A1, A2> a, DecomposableMatchBuilder0<EB> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 2 and the {@code b} value is decomposed to 1.
   */
  public static <A, B, EA extends A, A1, A2, EB extends B, B1> DecomposableMatchBuilder3<Tuple2<A, B>, A1, A2, B1> tuple2(
      DecomposableMatchBuilder2<EA, A1, A2> a, DecomposableMatchBuilder1<EB, B1> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 3.
   */
  public static <A, B, EA extends A, A1, A2, A3> DecomposableMatchBuilder3<Tuple2<A, B>, A1, A2, A3> tuple2(
      DecomposableMatchBuilder3<EA, A1, A2, A3> a, MatchesExact<B> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.eq(b.t));
    return new DecomposableMatchBuilder1<Tuple2<A, B>, EA>(
        matchers, 0, new Tuple2FieldExtractor<>()).decomposeFirst(a);
  }

  /**
   * Matches a tuple of 2 elements.
   *
   * <p>If matched, the {@code a} value is decomposed to 3 and the {@code b} value is decomposed to 0.
   */
  public static <A, B, EA extends A, A1, A2, A3, EB extends B> DecomposableMatchBuilder3<Tuple2<A, B>, A1, A2, A3> tuple2(
      DecomposableMatchBuilder3<EA, A1, A2, A3> a, DecomposableMatchBuilder0<EB> b) {
    List<Matcher<Object>> matchers = Lists.of(ArgumentMatchers.any(), ArgumentMatchers.any());
    return new DecomposableMatchBuilder2<Tuple2<A, B>, EA, EB>(
        matchers, Tuple2.of(0, 1), new Tuple2FieldExtractor<>()).decomposeFirstAndSecond(a, b);
  }
}
