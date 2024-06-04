// Sum of N numbers;


import java.util.*;
class Recursion1
{
    public static void sum(int n,int i,int sum1)
    {
        sum1 = sum1+i;
        if(i<n)
        {
            i++;
            sum(n,i,sum1);
        }
        else
        {
            System.out.println("SUM : "+sum1);
            return ;
        }

    }

    public static void main(String[] args)
    {
        int n,i=1;
        int sum1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = scanner.nextInt();
        sum(n,i,sum1);
        // System.out.println(res);
        scanner.close();
    }
}