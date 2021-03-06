/*
 * Copyright (C) 2011 Google Inc.
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

package org.ros.internal.manifest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ManifestDepend extends Depend {
  
  private final String package_name;
  
  public ManifestDepend(String package_name) {
    this.package_name = package_name;
  }
  
  @Override
  public Element toElement(Document doc) {
    Element element = super.toElement(doc);
    element.setAttribute("package", package_name);
    return element;
  }

}
