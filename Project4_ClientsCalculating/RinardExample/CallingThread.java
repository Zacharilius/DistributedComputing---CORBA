
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CallingThread extends Thread
{
    DBControlServerImpl dbcsiImpl = null;

    public CallingThread(DBControlServerImpl dbcsiImpl)
    {
        this.dbcsiImpl = dbcsiImpl;
    }

    public void run()
    {
        int userInput = 0;
        try
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    System.in));
            try
            {
                System.out.print("Please enter the number of clients you wish to connect: ");
                userInput = Integer.parseInt(read.readLine());
                System.out.println("Waiting for " + userInput + " clients to connect...");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            boolean completed = false;
            for (;;)
            {
                if (dbcsiImpl.getClientCount() >= userInput && !completed)
                {
                    System.out.println(userInput + " clients connected, starting work; check client screens...");
                    dbcsiImpl.sendWorkMessages();
                    completed = true;
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
