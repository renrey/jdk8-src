package org.omg.CosNaming;


/**
* org/omg/CosNaming/Binding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 20 January 2021 11:47:49 o'clock GMT
*/

public final class Binding implements org.omg.CORBA.portable.IDLEntity
{
  public org.omg.CosNaming.NameComponent binding_name[] = null;

  // name
  public org.omg.CosNaming.BindingType binding_type = null;

  public Binding ()
  {
  } // ctor

  public Binding (org.omg.CosNaming.NameComponent[] _binding_name, org.omg.CosNaming.BindingType _binding_type)
  {
    binding_name = _binding_name;
    binding_type = _binding_type;
  } // ctor

} // class Binding
