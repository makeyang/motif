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
 * A wildcard matcher that matches anything.
 *
 * @author John Leacox
 */
class Any<T> implements Matcher<T> {
  /**
   * A singleton instance of an {@link Any} matcher.
   */
  public static final Any ANY = new Any();

  private Any() {
  }

  @Override
  public boolean matches(Object arg) {
    return true;
  }
}
