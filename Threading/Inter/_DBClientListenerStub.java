package Inter;


/**
* Inter/_DBClientListenerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from rinard.idl
* Tuesday, March 25, 2014 11:50:29 AM EDT
*/

public class _DBClientListenerStub extends org.omg.CORBA.portable.ObjectImpl implements Inter.DBClientListener
{

  public void doWork ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("doWork", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                doWork (        );
            } finally {
                _releaseReply ($in);
            }
  } // doWork

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Inter/DBClientListener:1.0"};

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
} // class _DBClientListenerStub
