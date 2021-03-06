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

package com.leacox.motif.generate;

import com.squareup.javapoet.TypeName;

/**
 * A pair containing a type and its arity.
 *
 * @author John Leacox
 */
final class TypeNameWithArity {
  public final TypeName typeName;
  public final int arity;

  private TypeNameWithArity(TypeName typeName, int arity) {
    this.typeName = typeName;
    this.arity = arity;
  }

  public static TypeNameWithArity of(TypeName typeName, int arity) {
    return new TypeNameWithArity(typeName, arity);
  }
}

