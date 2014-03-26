import Inter.*;
import java.util.Vector;
import java.util.Iterator;

public class DBControlServerImpl extends DBControlServerPOA
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
