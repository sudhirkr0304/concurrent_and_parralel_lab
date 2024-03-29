package Assignment2;

import java.util.*;
import java.lang.*;
public class UnboundedArray
{

    private static int size = 0;
    public static int capacity;
    private static int[] arr;

    public UnboundedArray( int initial_size)
    {
        arr = new int[initial_size];
        capacity = initial_size;
    }

    public void insert(int element)
    {
        if(size == arr.length)
        {
            System.out.println(" !!! array is full !!!");
        }
        else
        {
            System.out.println(element+" is inserted");
            arr[size] = element;
            size++;
        }
    }

    public String get_array()
    {
        int[] arr2 = new int[size];

        for(int i=0;i<size;i++)
        {
            arr2[i] = arr[i];
        }
        return Arrays.toString(arr2);
    }

    public int getSize()
    {
        return size;
    }

    public int get_capacity()
    {
        return capacity;
    }

    public void delete()
    {
        if(size <= 0)
        {
            System.out.println(" !!! array is empty  !!! ");
        }
        else
        {
            System.out.println(arr[0]+" is deleted");
            int[] arr2 = new int[capacity];
            for(int i=1;i<size;i++)
            {
                arr2[i-1]=arr[i];
            }
            size--;
            arr = arr2;

        }

    }

    public void delete(int index)
    {
        if( index < 0 || index >= size)
        {
            System.out.println(" !!! Index out of range !!!");
        }
        {
            System.out.println(" element at index "+ index + " is deleted");
            int flag = 0;
            int[] arr2 = new int[capacity];
            for(int i=0;i<size;i++)
            {
                if(i == index)
                {
                    continue;
                }
                else
                {
                    arr2[flag] = arr[i];
                    flag++;
                }

            }
            arr =arr2;
            size--;
        }

    }

    public void delete(int startIndex , int endIndex)
    {
        if( startIndex < 0 || startIndex > size)
        {
            System.out.println(" !!! index out of range !!!");
        }
        else if(endIndex < 0 || endIndex > size || endIndex < startIndex)
        {
            System.out.println(" !!! index out of range !!!");
        }

        else
        {
            System.out.println("element from index" + startIndex + "to index"+endIndex+ " is deleted");
            int[] arr2 = new int[capacity];
            int flag=0;
            for(int i=0;i<size;i++)
            {
                if(i >= startIndex && i <= endIndex)
                {
                    continue;
                }
                arr2[flag] = arr[i];
                flag++;
            }
            arr = arr2;
            size = size -(endIndex - startIndex +1);
        }

    }

    public void modify(int index , int newElement)
    {
        if( index <  0  || index >= size)
        {
            System.out.println(" !!! index out of range !!!");
        }
        else
        {
            System.out.println("element at index " + index+" is modified");
            arr[index] = newElement;
        }


    }
}
