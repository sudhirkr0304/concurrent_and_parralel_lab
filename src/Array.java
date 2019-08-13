import java.util.*;

public class Array
{

    public static int initial_size = 4;  //actual length of array
    public static int size = 0;  // no of elements in array

    public static int[] arr;  //declaring array

    public Array()  // initializing array
    {
        arr = new int[initial_size];
    }

    public void insert(int element) {

        arr[size] = element;  //pushing elements into array
        size++;  //increasing no of elements

        if( size == (3*initial_size) / 4 )
        {
            initial_size = initial_size * 2;
            int[] arr2 = new int[initial_size];
            for(int i=0;i<size;i++)
            {
                arr2[i]=arr[i];
            }
            arr = arr2;
        }

        System.out.println("no of elements = "+size);
        System.out.println("size of array = "+initial_size);
        System.out.print("elements = ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("");
    }

    public void delete()
    {
        if(size == 0)
        {
            System.out.println(" !!! array is empty !!!");
        }
        else
        {
            size--;
            if( size == (initial_size) / 4 )
            {
                initial_size = initial_size/2;
                int[] arr2 = new int[initial_size];
                for(int i=0;i<size;i++)
                {
                    arr2[i]=arr[i];
                }
                arr = arr2;
            }

            System.out.println("no of elements = "+size);
            System.out.println("size of array = "+initial_size);
            System.out.print("elements = ");
            for(int i=0;i<size;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            System.out.println("");

        }
    }
}