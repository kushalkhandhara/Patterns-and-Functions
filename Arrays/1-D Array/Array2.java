// Find the maximum & minimum number in an array of integers. 

import java.util.*;
class Array2
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

        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min)
            {
                min = arr[j];
            }
        }
        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);



    }
}