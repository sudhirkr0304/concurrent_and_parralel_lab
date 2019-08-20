package Assignment1;
import java.lang.*;

import java.util.*;

public class UnboundedArray
{

    public static void main(String [] args)
    {
        //initializing array object
        Array array = new Array();


        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Add element to array");
            System.out.println("2.Modify element from array");
            System.out.println("3 . Delete element from array");
            System.out.println("4 . Exit program");
            System.out.println("");

            int choice;
            System.out.println(" Enter your choice : ");
            choice = sc.nextInt();


            if(choice == 1)
            {
                int ele;
                System.out.println(" Enter element to add : ");
                ele = sc.nextInt();

                array.insert(ele);  // insert method
            }
            else if(choice == 2)
            {
                int pos,ele;
                System.out.println("Enter the position ( 0 indexed ) :");
                pos=sc.nextInt();
                System.out.println("Enter the new element : ");
                ele = sc.nextInt();

                array.modify(pos,ele);
            }
            else if(choice == 3)
            {
                array.delete(); // delete method
            }
            else if(choice == 4)
            {
                break;
            }
            else
            {
                System.out.println(" !!! Wrong choice !!!");  //this is if we chose wrong option
            }
        }

        sc.close();
    }

}
