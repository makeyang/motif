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

package com.leacox.motif.extract.matchers;

/**
 * Matchers for use in creates matching cases.
 *
 * <p>These generally shouldn't be used direct except when creating 'Cases' classes like
 * {@link com.leacox.motif.cases.OptionalCases}.
 *
 * @author John Leacox
 */
public class ArgumentMatchers {
  private ArgumentMatchers() {
  }

  /**
   * Returns a wildcard matcher.
   */
  @SuppressWarnings("unchecked")
  public static <T> Matcher<T> any() {
    return Any.ANY;
  }

  /**
   * Returns an equals matcher for the given value.
   */
  @SuppressWarnings("unchecked")
  public static <T> Matcher<T> eq(T value) {
    return (Matcher<T>) new Equals(value);
  }
}
