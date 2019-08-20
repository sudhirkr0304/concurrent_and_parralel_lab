package Assignment2;

import java.lang.Thread;
import java.util.*;

public class DeleteThread2 extends Thread
{
    private static UnboundedArray array;

    public DeleteThread2(String name , UnboundedArray arr)
    {
        super(name);
        array = arr;
    }
    public void run()
    {
        while(true)
        {
            int size =array.getSize();

            array.delete(size/4,(3*size)/4);
    
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