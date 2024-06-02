import java.util.*;
class GCD
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number 1: ");
        n1 = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        n2 = scanner.nextInt();
        if(n1 == n2)
        {
            System.out.println("Both Numbers Are Same!!");
            scanner.close();
            return;
        }
        int gcd  = gcd(n1,n2);
        System.out.println("GCD: "+gcd);
        scanner.close();
    }

    public static int gcd(int n1,int n2)
    {
        if(n1>n2)
        {
            int max = 1;
            for(int i = 1; i <= n1; i++)
            {
                if(n1%i==0 && n2%i==0)
                {
                    max = i;
                }
            }
            return max;
        }
        else if(n2>n1)
        {
            int max = 1;
            for(int i = 1; i <= n2; i++)
            {
                if(n1%i==0 && n2%i==0)
                {
                    max = i;
                }
            }
            return max;
        }

        return -1;
        
    }
}