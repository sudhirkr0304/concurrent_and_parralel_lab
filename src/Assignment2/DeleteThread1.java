package Assignment2;

import java.lang.Thread;
import java.util.*;

public class DeleteThread1 extends Thread
{
    private static UnboundedArray array;

    public DeleteThread1(String name , UnboundedArray arr)
    {
        super(name);
        array = arr;
    }
    public void run()
    {
        while(true)
        {
        array.delete();
        array.delete();

        try
        {
            sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        }
        
    }

}