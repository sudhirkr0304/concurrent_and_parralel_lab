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
            System.out.println("2 . Delete element from array");
            System.out.println("3 . Exit program");
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
                array.delete(); // delete method
            }
            else if(choice == 3)
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
