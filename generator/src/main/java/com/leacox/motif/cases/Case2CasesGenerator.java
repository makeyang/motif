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

import com.leacox.motif.caseclass.Case2;
import com.leacox.motif.generate.CasesGenerator;
import com.leacox.motif.generate.Match2MethodSpec;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;

import java.io.IOException;

/**
 * Generator for {@link Case2} match cases.
 *
 * @author John Leacox
 */
final class Case2CasesGenerator {
  private Case2CasesGenerator() {
  }

  public static void main(String[] args) {
    TypeName A = TypeVariableName.get("A");
    TypeName B = TypeVariableName.get("B");
    TypeName bounds = ParameterizedTypeName.get(ClassName.get(Case2.class), A, B);
    TypeName t = TypeVariableName.get("T", bounds);
    TypeName clazz = ParameterizedTypeName.get(ClassName.get(Class.class), t);

    Match2MethodSpec case2Match = Match2MethodSpec.builder()
        .withName("case2").withSummaryJavadoc("Matches a case class of two elements.\n")
        .addNonMatchParam(clazz, "clazz").withMatchExtractor(Case2FieldExtractor.class, "clazz")
        .withParamA(A, "a").withParamB(B, "b").build();

    JavaFile case2CasesFile = CasesGenerator.newBuilder(
        "com.leacox.motif.cases", "Case2Cases", t)
        .addFileComment(Copyright.COPYRIGHT_NOTICE)
        .addJavadoc("Motif cases for matching a {@link Case2}.\n")
        .addMatch2Method(case2Match)
        .build().generate();

    try {
      case2CasesFile.writeTo(System.out);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
