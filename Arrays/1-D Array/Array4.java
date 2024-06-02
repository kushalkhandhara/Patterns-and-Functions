// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.
import java.util.*;
class Array4
{
    public static void main(String[] args) 
    {
        int size;
        boolean isAscending = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        size = scanner.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter Inputs : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        // Logic
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i+1] <arr[i])
            {
                isAscending = false;
            } 
        }
        if(isAscending)
        {
            System.out.println("array is in ascending order");
        }
        else
        {
            System.out.println("array is not in ascending order");
        }
        scanner.close();

    }
}