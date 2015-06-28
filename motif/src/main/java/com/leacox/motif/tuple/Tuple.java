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
package com.leacox.motif.tuple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author John Leacox
 */
public abstract class Tuple {
  private final List<Object> values;

  protected Tuple(Object... values) {
    // TODO: Is it worth pulling in Guava to use ImmutableList?
    this.values = Collections.unmodifiableList(Arrays.asList(values));
  }

  public List<Object> toList() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Tuple)) {
      return false;
    }
    Tuple tuple = (Tuple) o;
    return Objects.equals(values, tuple.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return "(" + values.stream().reduce((t, u) -> t + "," + u).get() + ")";
  }
}
