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

import org.assertj.core.api.Condition;
import org.assertj.examples.data.BasketBallPlayer;

/**
 * 
 * A {@code Condition} checking if a {@link BasketBallPlayer} is a potential MVP.
 * 
 * @author Joel Costigliola
 */
public class PotentialMvpCondition extends Condition<BasketBallPlayer> {

  public PotentialMvpCondition() {
    super("a potential MVP");
  }

  @Override
  public boolean matches(BasketBallPlayer player) {
    return player.getPointsPerGame() > 20 && (player.getAssistsPerGame() >= 8 || player.getReboundsPerGame() >= 8);
  }

}
