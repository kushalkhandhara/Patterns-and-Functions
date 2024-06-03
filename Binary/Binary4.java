import java.util.*;
// Decimal to Binary
public class Binary4 
{
    public static void  decimaltoBinary(int n)
    {
       int[] arr = new int[n];
       int i = 0;
       while(n>0)
       {
        arr[i] = n%2;
        n = n/2;
        i++;
       }
       for(int j = 0; j < arr.length; j++)
       {
        System.out.print(arr[j]);
       }
 

    }

    public static int powerOf2(int a, int i)
    {
        if(i==0)
        {
            return 1;
        }
        else
        {
            for(int j = 0; j < i; j++)
            {
                a*=2;
            }
            return a;
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        decimaltoBinary(num);
        scanner.close();
        
    }
    
}
