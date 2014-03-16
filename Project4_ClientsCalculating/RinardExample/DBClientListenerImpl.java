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
