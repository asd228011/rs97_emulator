/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package sdljava.x.swig;

public final class SDLAppStateValues {
  public final static SDLAppStateValues APPMOUSEFOCUS = new SDLAppStateValues("APPMOUSEFOCUS", 0x01);
  public final static SDLAppStateValues APPINPUTFOCUS = new SDLAppStateValues("APPINPUTFOCUS", 0x02);
  public final static SDLAppStateValues APPACTIVE = new SDLAppStateValues("APPACTIVE", 0x04);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDLAppStateValues swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDLAppStateValues.class + " with value " + swigValue);
  }

  private SDLAppStateValues(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDLAppStateValues(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private static SDLAppStateValues[] swigValues = { APPMOUSEFOCUS, APPINPUTFOCUS, APPACTIVE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

