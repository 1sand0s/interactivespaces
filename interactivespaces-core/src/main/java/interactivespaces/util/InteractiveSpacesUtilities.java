/*
 * Copyright (C) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package interactivespaces.util;

/**
 * useful utilities for using Interactive Spaces.
 *
 * @author Keith M. Hughes
 */
public class InteractiveSpacesUtilities {

  /**
   * Delay current thread for some amount of time.
   *
   * @param time
   *          Amount of time to delay, in milliseconds.
   */
  public static void delay(long time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      // Don't care
    }
  }

}
