// Display Array in Ascending Order
import java.util.*;
class Array3
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
        int temp;

        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i+1]<arr[i])
            {
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("Display Array in Ascending Order : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}