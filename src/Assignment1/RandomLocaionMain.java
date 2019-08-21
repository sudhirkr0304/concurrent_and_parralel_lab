package Assignment1;

import java.util.*;
import java.lang.*;

public class RandomLocaionMain
{
    public static int generate(int min , int max)
    {
        return min + (int) ( Math.random() * (max-min) +1);
    }
    public static void main(String [] args)
    {
        RandomArray randomArray = new RandomArray();

        randomArray.insert(0,5);
        randomArray.insert(0,4);
        randomArray.insert(0,3);
        randomArray.insert(0,2);
        randomArray.insert(0,1);

        randomArray.insert(generate(0,randomArray.getSize()),10);
        randomArray.insert(generate(0,randomArray.getSize()),20);
        randomArray.insert(generate(0,randomArray.getSize()),30);
        randomArray.insert(generate(0,randomArray.getSize()),40);

        randomArray.delete(generate(0,randomArray.getSize()));
        randomArray.delete(generate(0,randomArray.getSize()));
        randomArray.delete(generate(0,randomArray.getSize()));
    }
}
