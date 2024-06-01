// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
class String1
{
    public static void main(String[] args)
    {
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        size = scanner.nextInt();
        
        String[] arr = new String[size];

        System.out.println("Enter String : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.next();
        }
        int length = 0;

        System.out.println("Combined Size of String : ");
        for(int i = 0; i < size; i++)
        {
            length+=arr[i].length();
        }
        System.out.println("Length : "+length);
        scanner.close();

        
    }

}