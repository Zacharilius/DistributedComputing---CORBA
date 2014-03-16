package Inter;


/**
* Inter/DBControlServerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Rinard.idl
* Thursday, March 6, 2014 10:30:47 AM EST
*/

abstract public class DBControlServerHelper
{
  private static String  _id = "IDL:Inter/DBControlServer:1.0";

  public static void insert (org.omg.CORBA.Any a, Inter.DBControlServer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Inter.DBControlServer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Inter.DBControlServerHelper.id (), "DBControlServer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Inter.DBControlServer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DBControlServerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Inter.DBControlServer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Inter.DBControlServer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Inter.DBControlServer)
      return (Inter.DBControlServer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Inter._DBControlServerStub stub = new Inter._DBControlServerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Inter.DBControlServer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Inter.DBControlServer)
      return (Inter.DBControlServer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Inter._DBControlServerStub stub = new Inter._DBControlServerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
