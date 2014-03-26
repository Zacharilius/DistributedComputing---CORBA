package ex1; 
import Tracker.*; // The package containing our stubs. 
import org.omg.CosNaming.*; // Client will use the naming service. 
import org.omg.CORBA.*; // All CORBA applications need these classes. 
public class Client { 
	public static void main (String args[]) { 
		try { 
			// Create and initialize the ORB 
			ORB orb = ORB.init (args, null); 
			// Get the root naming context
			org.omg.CORBA.Object objRef = 
										orb.resolve_initial_references ("NameService"); 
			NamingContext ncRef = NamingContextHelper.narrow (objRef); 
			// Resolve the object reference in naming 
			NameComponent nc = new NameComponent ("TimeServer", ""); 
			NameComponent path[] = {nc}; 
			Time timeRef = TimeHelper.narrow (ncRef.resolve (path)); 
			// Call the time server object and print results 
			String time = "Time on the Server is " + timeRef.getTime (); 
			System.out.println (time); 
} catch (Exception e) { 
e.printStackTrace (); 
} 
} 
} 

