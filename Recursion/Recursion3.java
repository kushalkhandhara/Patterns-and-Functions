// Fibonacci Series 

public class Recursion3 
{
    public static void fibonacci(int n,int a,int b)
    {
        if(n==0)
        {
            return;
        }
        int c = a+b;
        System.out.print(c + " ");
        a = b;
        b = c;
        fibonacci(n-1, a, b);
    }

    public static void main(String[] args) 
    {
        
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 7;
        fibonacci(n,a,b); 
    }
    
}
