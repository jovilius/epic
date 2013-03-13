/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package chalk.tools.util;

import java.util.Collection;
import java.util.Iterator;

import nak.core.Event;


/**
 * Creates an event stream out of a collection of events.
 */
public class CollectionEventStream extends nak.data.AbstractEventStream {

  private Iterator<Event> ci;

  public CollectionEventStream(Collection<Event> c) {
    ci = c.iterator();
  }

  public Event next() {
    return ci.next();
  }

  public boolean hasNext() {
    return ci.hasNext();
  }

}
