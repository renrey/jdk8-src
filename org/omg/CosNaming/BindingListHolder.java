package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 20 January 2021 11:47:49 o'clock GMT
*/


/**
   * List of Bindings.
   */
public final class BindingListHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.Binding value[] = null;

  public BindingListHolder ()
  {
  }

  public BindingListHolder (org.omg.CosNaming.Binding[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.BindingListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.BindingListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.BindingListHelper.type ();
  }

}
