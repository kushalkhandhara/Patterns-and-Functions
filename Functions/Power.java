import java.util.*;
class Power
{
    public static void main(String[] args)
    {
        int n;
        int p;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        n = scanner.nextInt();
        
        System.out.println("Enter Power : ");
        p = scanner.nextInt();


        int power = power(n,p);
        System.out.println("Power : "+power);
        scanner.close();
    }
    public static int power(int num,int p)
    {
        int mult = 1;
        for(int i=1; i<=p; i++)
        {
            mult = mult * num;
        }
        return mult;



    }
}