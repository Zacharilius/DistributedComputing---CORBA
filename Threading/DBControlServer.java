// Changed from Oracle's HelloServer.java
 
import TaxCalculator.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
import Inter.*;
import java.util.Vector;
import java.util.Iterator;

public class  DBControlServerImpl extends DBControlServerPOA
{
    private Vector clients = new Vector(); // The clients currently connected
    private CallingThread ct = null;

    public DBControlServerImpl()
    {
        ct = new CallingThread(this);
    }

    public void requestConnect(DBClientListener dbcl)
    {
        System.out.println("A client has connected.");
        clients.add(dbcl);
    }

    public void startCallingThread()
    {
        ct.start();
    }

    public int getClientCount()
    {
        return clients.size();
    }

    public void sendWorkMessages()
    {
        Iterator it = clients.iterator();
        while (it.hasNext())
        {
            DBClientListener dbcl = (DBClientListener) it.next();
            dbcl.doWork();
        }
    }
}


public class DBControlServer {

  public static void main(String args[]) {
    try{
      // create and initialize the ORB
      ORB orb = ORB.init(args, null);

      // get reference to rootpoa & activate the POAManager
      POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
      rootpoa.the_POAManager().activate();

      // create servant and register it with the ORB
      DBControlServerImpl DBControlServerImpl = new DBControlServerImpl();
      DBControlServerImpl.setORB(orb); 

      // get object reference from the servant
	  //Object reference known to system to identify the TaxImple
	  //href is a reference
      org.omg.CORBA.Object ref = rootpoa.servant_to_reference(DBControlServerImpl);
      Tax href = TaxHelper.narrow(ref);
      
	  // want give name to the reference
      // get the root naming context
      // NameService invokes the name service
	  // allows to have names
      org.omg.CORBA.Object objRef =
          orb.resolve_initial_references("NameService");
      // Use NamingContextExt which is part of the Interoperable
      // Naming Service (INS) specification.
      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

      
	  // bind the Object Reference in Naming
	  // after binding...should see server is ready
      String name = "TaxCalculator"; //name is whatever sending back and forth and giving name to..doesnt matter what name so "derp" or "foo"
      NameComponent path[] = ncRef.to_name( name );
      ncRef.rebind(path, href);

      System.out.println("TaxCalculatorServer ready and waiting ...");

      // wait for invocations from clients
      orb.run();
    } 
        
      catch (Exception e) {
        System.err.println("ERROR: " + e);
        e.printStackTrace(System.out);
      }
          
      System.out.println("TaxCalculatorServer Exiting ...");
        
  }
}