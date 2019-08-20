package Assignment2;

import java.util.*;
import java.lang.Thread;

public class Modify_Thread extends Thread
{
    private static UnboundedArray array;
    public Modify_Thread(String name , UnboundedArray arr)
    {
        super(name);
        array = arr;
    }
    public static int generate(int min , int max)
    {
        return min + (int) ( Math.random() * (max-min) +1);
    }

    public void run()
    {
        while(true)
        {
            int size = array.getSize();
            int location = generate(0,size);
            int value = generate(1,100);
            array.modify(location , value);
            System.out.println("element at index " + location + " is modified");
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