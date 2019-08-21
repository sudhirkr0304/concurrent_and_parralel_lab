package Assignment1;

public class RandomArray
{
    public static int initial_size = 4;  //actual length of array
    public static int size = 0;  // no of elements in array

    public static int[] arr;  //declaring array

    public RandomArray()  // initializing array
    {
        arr = new int[initial_size];
    }

    public void insert( int position , int element)
    {
        if(position < 0 || position > size)
        {
            System.out.println("!!! index out of range");
        }
        else
        {
            int[] arr2 = new int[initial_size];
            int flag = 0;
            for(int i=0;i<position;i++)
            {
                arr2[flag] =arr[i];
                flag++;
            }
            arr2[position]=element;
            flag++;
            for(int i=position;i<size;i++)
            {
                arr2[flag] =arr[i];
                flag++;
            }
            arr = arr2;
            size++;

            if( size == (3*initial_size) / 4 )
            {
                initial_size = initial_size * 2;
                int[] arr3 = new int[initial_size];
                for(int i=0;i<size;i++)
                {
                    arr3[i]=arr[i];
                }
                arr = arr3;
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

    public void delete (int index )
    {
        if( index < 0 || index >= size)
        {
            System.out.println(" !!! Index out of range !!!");
        }
        else {
            System.out.println(" element " + arr[index] + " at index " + index + " is deleted ");
            int flag = 0;
            int[] arr2 = new int[initial_size];
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
    public int getSize()
    {
        return size;
    }
}
