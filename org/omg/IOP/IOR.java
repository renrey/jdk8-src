package org.omg.IOP;


/**
* org/omg/IOP/IOR.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 20 January 2021 11:47:50 o'clock GMT
*/

public final class IOR implements org.omg.CORBA.portable.IDLEntity
{

  /** The type id, represented as a String. */
  public String type_id = null;

  /** 
  	 * An array of tagged profiles associated with this 
  	 * object reference. 
  	 */
  public org.omg.IOP.TaggedProfile profiles[] = null;

  public IOR ()
  {
  } // ctor

  public IOR (String _type_id, org.omg.IOP.TaggedProfile[] _profiles)
  {
    type_id = _type_id;
    profiles = _profiles;
  } // ctor

} // class IOR
