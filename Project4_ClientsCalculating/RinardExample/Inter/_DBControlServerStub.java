package Inter;


/**
* Inter/_DBControlServerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Rinard.idl
* Thursday, March 6, 2014 10:30:47 AM EST
*/

public class _DBControlServerStub extends org.omg.CORBA.portable.ObjectImpl implements Inter.DBControlServer
{

  public void requestConnect (Inter.DBClientListener dbc)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("requestConnect", true);
                Inter.DBClientListenerHelper.write ($out, dbc);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                requestConnect (dbc        );
            } finally {
                _releaseReply ($in);
            }
  } // requestConnect

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Inter/DBControlServer:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _DBControlServerStub
