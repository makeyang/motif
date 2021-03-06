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

import com.leacox.motif.extract.Extractor3;
import com.leacox.motif.tuple.Tuple3;

import java.util.Optional;

/**
 * An extract for extracting the fields of a {@link Tuple3}.
 *
 * @author John Leacox
 */
public class Tuple3Extractor<A, B, C> implements Extractor3<Tuple3<A, B, C>, A, B, C> {
  private Tuple3Extractor() {
  }

  /**
   * Creates a new instances of {@link Tuple3Extractor}.
   */
  public static <A, B, C> Tuple3Extractor<A, B, C> create() {
    return new Tuple3Extractor<>();
  }

  @Override
  public Optional<Tuple3<A, B, C>> unapply(Tuple3<A, B, C> tuple3) {
    return Optional.ofNullable(tuple3);
  }

  @Override
  public Class<Tuple3> getExtractorClass() {
    return Tuple3.class;
  }
}
