import java.io.IOException;

public class LaunchWordNotpadOR
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
            runtime.exec("notepad.exe");        //opens new notepad instance
 
            //OR runtime.exec("notepad");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}