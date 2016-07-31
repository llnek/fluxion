/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) 2013-2016, Kenneth Leung. All rights reserved. */

package czlab.wflow;

import czlab.server.ServerLike;
import czlab.server.Event;
import czlab.xlib.Debuggable;
import czlab.xlib.Gettable;
import czlab.xlib.Identifiable;
import czlab.xlib.Settable;

/**
 * @author Kenneth Leung
 */
public interface Job extends Gettable , Settable, Identifiable, Debuggable {

  public static final String JS_LAST = "____lastresult";

  /**/
  public void setLastResult(Object v) ;

  /**/
  public void clrLastResult() ;

  /**/
  public Object lastResult() ;

  /**/
  public ServerLike server();

  /**/
  public void clear();

  /**/
  public Event event() ;

  /**/
  public WorkStream wflow();

}




