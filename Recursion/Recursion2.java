// Print Factorial of number

import java.util.Scanner;


public class Recursion2 
{
    public static void fact(int n,int i,int pro)
    {
        if(n==0 || n==1)
        {
            System.out.println("Factorial is : " + n);
            return;
        }
        if(i>0)
        {
            pro = pro*i;
            i--;
            fact(n, i, pro);
        }
        else
        {
            System.out.println("Factorial is : " + pro);
            return;
        }
        



    }

    public static void main(String[] args) 
    {
        int n;
        int pro=1,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = scanner.nextInt();
        i = n;
        fact(n,i,pro);  
        scanner.close();
    }
    
}
