package ex1;
// The package containing our stubs.
import Tracker.*; 
// Server will use the naming service.
import org.omg.CosNaming.*; 
// The package containing special exceptions thrown by the name service.
import org.omg.CosNaming.NamingContextPackage.*; 
// All CORBA applications need these classes.
import org.omg.CORBA.*; 
import java.util.*;
import java.text.*;

class TimeServer extends _TimeImplBase {
	public String getTime () {
		SimpleDateFormat formatter = 
									new SimpleDateFormat ("MMMMM dd, yyyyy GGG, hh:mm:ss:SSS aaa");
		Date date = new Date ();
		return formatter.format (date);
	} 
}
public class Server { 
	public static void main (String args[]) { 
		try {
			// Create and initialize the ORB
			ORB orb = ORB.init (args, null);
			// Create the servant and register it with the ORB
			TimeServer timeRef = new TimeServer ();
			orb.connect (timeRef);
			// Get the root naming context
			org.omg.CORBA.Object objRef = orb.resolve_initial_references ("NameService"); 
			NamingContext ncRef = NamingContextHelper.narrow (objRef);
			// Bind the object reference in naming
			NameComponent nc = new NameComponent ("TimeServer", "");
			NameComponent path[] = {nc};
			ncRef.rebind (path, timeRef);
			// Wait forever for current thread to die
			Thread.currentThread ().join (); 
		} catch (Exception e) {
			e.printStackTrace ();
		} 
	} 
}

