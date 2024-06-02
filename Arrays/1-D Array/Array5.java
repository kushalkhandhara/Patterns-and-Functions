// Search in the array and prints its indices

import java.util.*;
class Array5
{
    public static void main(String[] args)
    {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        size = scanner.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter Inputs : ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int x;
        System.out.println("Enter Number to be Search : ");
        x = scanner.nextInt();

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                System.out.println("Number Found at index : "+i);
                break;
            }

        }
        scanner.close();

    }

}