//      1 
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1

import java.util.*;

class Pattern6
{
    public static void main(String[] args)
    {
        int rows = 5;
        for(int i = 0; i < rows; i++)
        {
            for(int k = 0 ;k<(rows-i);k++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++)
            {
                int nCr = Combination(i,j);
                System.out.print(nCr + " ");
            }
            System.out.println();
        }
    }

    public static int fact(int n)
    {
        int mult = 1;
        for(int i=n;i>0;i--)
        {
            mult = mult*i;
        }
        return mult;

    } 
    public static int  Combination(int n, int r)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            int product = fact(n-r) * fact(r);
            return fact(n)/product;
        }
    }
}