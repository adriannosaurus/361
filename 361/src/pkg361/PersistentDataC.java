package pkg361;
import java.io.*;

public class PersistentDataC
{
    private static PersistentDataC thePDC;
    private PersistentData thePD;
    private final String externalDataPath = "";
    private final String dataFileName = "AppData.ser";
    
    private PersistentDataC()
            {
                readSerializedData();
                if(thePD == null)
                {
                    try
                    {
                        thePD = new PersistentData();
                        System.out.println("New ser file created");
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    writeSerializedData();
                    readSerializedData();
                }
            }
            
            public static PersistentDataC getPersistentDataC()
            {
                if(thePDC == null)
                {
                    thePDC = new PersistentDataC();
                }
                return thePDC;
            }
            
            public PersistentData getPersistentData()
            {
                return thePD;
            }
            
            public void readSerializedData()
            {
                FileInputStream fis = null;
                ObjectInputStream ois = null;
                String filePath = externalDataPath + dataFileName;
                try
                {
                    fis = new FileInputStream(filePath);
                    ois = new ObjectInputStream(fis);
                    thePD = (PersistentData)ois.readObject();
                    ois.close();
                }
                catch(IOException | ClassNotFoundException e)
                {
                    System.out.println("File doesn't exist oops");
                }
            }
            
            public void writeSerializedData()
            {
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;
                String filePath = externalDataPath + dataFileName;
                try
                {
                    fos = new FileOutputStream(filePath);
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(thePD);
                    oos.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                
            }
            
}
