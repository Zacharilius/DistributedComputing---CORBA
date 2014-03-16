// Changed from Oracle's HelloServer.java
 
import TaxCalculator.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;

class TaxImpl extends TaxPOA {
  private ORB orb;

  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    
  // implement getTax() method
  public double getTax(double cost) {
	double d = cost * 1.06;
    return d;
  }
    
  // implement shutdown() method
  public void shutdown() {
    orb.shutdown(false);
  }
}


public class TaxCalculatorServer {

  public static void main(String args[]) {
    try{
      // create and initialize the ORB
      ORB orb = ORB.init(args, null);

      // get reference to rootpoa & activate the POAManager
      POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
      rootpoa.the_POAManager().activate();

      // create servant and register it with the ORB
      TaxImpl TaxImpl = new TaxImpl();
      TaxImpl.setORB(orb); 

      // get object reference from the servant
	  //Object reference known to system to identify the TaxImple
	  //href is a reference
      org.omg.CORBA.Object ref = rootpoa.servant_to_reference(TaxImpl);
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