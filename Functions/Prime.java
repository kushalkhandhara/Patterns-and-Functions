import java.util.*;
class Prime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        if(n==0)
        {
            System.out.println("It is Not Prime Not a Composite Number");
            return;
        }
        boolean prime  = isPrime(n);
        if(prime)
        {
            System.out.println(n + " is Prime number");
        }
        else
        {
            System.out.println(n + " is not Prime number");
        }
    }
    public static boolean isPrime(int num)
    {
        for(int i = 2; i <= num/2; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}