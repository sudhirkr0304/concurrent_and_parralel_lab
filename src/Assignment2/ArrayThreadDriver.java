package Assignment2;

import java.util.*;
import java.lang.*;

public class ArrayThreadDriver
{
    public static int generate(int min , int max)
    {
        return min + (int) ( Math.random() * (max-min) +1);
    }

    public static void main(String [] args)
    {
        int initial_capacity = generate(1,20);

        UnboundedArray ubb = new UnboundedArray(initial_capacity);


        InsertThread insertThread = new InsertThread("Insert Thread ", ubb);

        DeleteThread1 deleteThread1 = new DeleteThread1("Delte Single Thread", ubb);

        DeleteThread2 deleteThread2 = new DeleteThread2("Delete Range Thread", ubb);

        Modify_Thread modify_Thread = new Modify_Thread("modify thread", ubb);

        insertThread.start();
        deleteThread1.start();
        deleteThread2.start();
        modify_Thread.start();

    }
}