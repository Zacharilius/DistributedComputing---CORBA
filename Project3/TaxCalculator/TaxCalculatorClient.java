// Copyright and License 
 import java.util.Random;
import TaxCalculator.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class TaxCalculatorClient
{
  static Tax taxImpl;

  public static void main(String args[])
    {
      try{
        // create and initialize the ORB
        ORB orb = ORB.init(args, null);

        // get the root naming context
        org.omg.CORBA.Object objRef = 
            orb.resolve_initial_references("NameService");
        // Use NamingContextExt instead of NamingContext. This is 
        // part of the Interoperable naming Service.  
        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef); //
 
        // resolve the Object Reference in Naming
        String name = "TaxCalculator"; //Needs to match server
        taxImpl = TaxHelper.narrow(ncRef.resolve_str(name));

        System.out.println("Obtained a handle on server object: " + taxImpl);
		
		//generates & sends a random number used as the client id
		Random rn = new Random();
		int randomID = rn.nextInt(200000);
		System.out.println("The client id is: " + randomID);
		System.out.println(taxImpl.getClientID(randomID));
		
		//Sends a dollar value to the server to add the tax
		System.out.println("At 6% MD tax rate: ");
        System.out.println("$5.00 is: $" + taxImpl.getTax(5.00));
        System.out.println("$15.00 is: $" + taxImpl.getTax(15.00));
        System.out.println("$25.00 is: $" + taxImpl.getTax(25.00));
        System.out.println("$105.00 is: $" + taxImpl.getTax(105.00));
        //taxImpl.shutdown();

        } catch (Exception e) {
          System.out.println("ERROR : " + e) ;
          e.printStackTrace(System.out);
          }
    }

}