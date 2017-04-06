/**
 * Copyright (c) 2013-2017, Kenneth Leung. All rights reserved.
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 * You must not remove this notice, or any other, from this software.
 */

package czlab.flux.wflow;

import czlab.jasal.Idable;
import czlab.jasal.Debuggable;
import czlab.jasal.Gettable;
import czlab.jasal.Settable;
import czlab.jasal.Schedulable;

/**
 * @author Kenneth Leung
 */
public interface Job extends Gettable , Settable, Idable, Debuggable {

  /**/
  public void setLastResult(Object v) ;

  /**/
  public void clrLastResult() ;

  /**/
  public Object lastResult() ;

  /**/
  public Schedulable scheduler();

  /**/
  public void clear();

  /**/
  public Object origin() ;

  /**/
  public Workstream wflow();

}



