import java.util.*;

public class Array
{

    public static int initial_size = 4;
    public int[] arr;

    public Array() {
        arr = new int[initial_size];
    }

    public void insert(int element) {
        int length = arr.length;
        arr[length] = element;

        if (arr.length == (initial_size * 3) / 4) {
            initial_size = initial_size * 2;
            int[] arr2 = new int[initial_size];

            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        System.out.println(" size of array = " + arr.length);
        System.out.println(" capacity of array = " + initial_size);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void delete() {

    }
}