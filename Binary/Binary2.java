// Write a program to count the number of 1’s in a binary representation of the number.

import java.util.*;

public class Binary2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String binary;
        int count = 0;
        System.out.println("Enter Binary Number : ");
        binary = scanner.next();
        for(int i = 0; i < binary.length(); i++) 
        {
            if(binary.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println("Count 1's : " + count);
        scanner.close();
    }
}
