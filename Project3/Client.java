import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
//import Inter.*;

public class Client
{
    public static void main(String[] args)
    {
        try
        {
            // initialize orb
            ORB orb = ORB.init(args, null);
            System.out.println("Initialized ORB");

            // Instantiate Servant and create reference
            POA rootPOA = POAHelper.narrow(orb
                    .resolve_initial_references("RootPOA"));
            DBClientListenerImpl listener = new DBClientListenerImpl();
            rootPOA.activate_object(listener);
            DBClientListener ref = DBClientListenerHelper.narrow(rootPOA
                    .servant_to_reference(listener));

            // Resolve DBControlServer
            DBControlServer dbcServer = DBControlServerHelper
                    .narrow(orb.string_to_object(
                    "corbaname:iiop:1.2@localhost:1050#DBControlServer"));

            // Register listener reference (callback object) with MessageServer
            dbcServer.requestConnect(ref);
            System.out.println("Registered with DBControlServer.");

            // Activate rootPOA
            rootPOA.the_POAManager().activate();

            // Wait for work request
            System.out.println("Waiting for work request.");
            orb.run();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}