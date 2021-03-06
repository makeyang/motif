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

import com.leacox.motif.extract.FieldExtractor;
import com.leacox.motif.tuple.Tuple2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Field extractor for extracting a {@link List} into a head element and a tail of remaining
 * elements.
 *
 * @author John Leacox
 */
final class ListConsHeadTailFieldExtractor<A> implements FieldExtractor<List<A>> {
  private final ListConsHeadTailExtractor<A> listExtractor = ListConsHeadTailExtractor.create();

  @Override
  public Optional<List<Object>> unapply(List<A> value) {
    Optional<Tuple2<A, List<A>>> opt = listExtractor.unapply(value);
    if (!opt.isPresent()) {
      return Optional.empty();
    }

    List<Object> fields = new ArrayList<>();
    fields.add(opt.get().first());
    fields.add(opt.get().second());

    return Optional.of(fields);
  }

  @Override
  public Class<?> getExtractorClass() {
    return listExtractor.getExtractorClass();
  }
}
