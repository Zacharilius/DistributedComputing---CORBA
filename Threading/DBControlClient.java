// Copyright and License 
import java.util.Random;
import TaxCalculator.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import Inter.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DBClientListenerImpl extends DBClientListenerPOA
{
    public void doWork()
    {
        File rDir = new File(System.getProperty("user.dir"));
        rDir = new File(rDir.getAbsolutePath() + File.separatorChar);
        File inFile = new File(rDir.getAbsolutePath() + File.separatorChar
                + "Database.dat");
        if (inFile.exists())
        {
            try
            {
                BufferedReader in = new BufferedReader(new FileReader(inFile));
                String tmp = ""; // Temp line holder.
                long timeElapsed = 0;
                long startTime = System.currentTimeMillis();
                tmp = in.readLine();
                while (tmp != null)
                {
                    tmp = in.readLine();
                }
                long endTime = System.currentTimeMillis();
                timeElapsed = endTime - startTime;
                System.out.println("Client finished computations on file in "
                        + timeElapsed + " ms.");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        } else {
            System.out.println("Database file was not found");
        }
    }
}
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