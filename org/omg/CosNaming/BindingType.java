package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 20 January 2021 11:47:49 o'clock GMT
*/


/**
   * Specifies whether the given binding is for a object (that is not a
   * naming context) or for a naming context.
   */
public class BindingType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.omg.CosNaming.BindingType[] __array = new org.omg.CosNaming.BindingType [__size];

  public static final int _nobject = 0;
  public static final org.omg.CosNaming.BindingType nobject = new org.omg.CosNaming.BindingType(_nobject);
  public static final int _ncontext = 1;
  public static final org.omg.CosNaming.BindingType ncontext = new org.omg.CosNaming.BindingType(_ncontext);

  public int value ()
  {
    return __value;
  }

  public static org.omg.CosNaming.BindingType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected BindingType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class BindingType