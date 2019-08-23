package Assignment2;

import java.lang.Thread;
import java.util.Random;


public class InsertThread extends Thread
{
    private static UnboundedArray array;
    

    public InsertThread(String name,  UnboundedArray arr)
    {
        super(name);
        array = arr;
        
    }
    public static int generate(int min , int  max)

    {
       return min + (int) (Math.random()*(max - min)+1);
    }
    public void run()
    {
        while(true)
        {
            for(int i=1;i <= 3;i++)
            {
                int val = generate(1,100);
                array.insert(val);
            }
    
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