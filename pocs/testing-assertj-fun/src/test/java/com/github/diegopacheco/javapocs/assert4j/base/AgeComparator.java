/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2016 the original author or authors.
 */
package com.github.diegopacheco.javapocs.assert4j.base;

import java.util.Comparator;

import org.assertj.examples.data.TolkienCharacter;

/**
 * Compare {@link TolkienCharacter} age.
 *
 * @author Joel Costigliola 
 */
public class AgeComparator implements Comparator<TolkienCharacter> {
  @Override
  public int compare(TolkienCharacter tolkienCharacter1, TolkienCharacter tolkienCharacter2) {
    Integer age1 = tolkienCharacter1.age;
    return age1.compareTo(tolkienCharacter2.age);
  }

  @Override
  public String toString() {
    return "TolkienCharacterAgeComparator";
  }

}
