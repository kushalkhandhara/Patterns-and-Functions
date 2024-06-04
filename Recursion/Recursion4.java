// Power x^n

public class Recursion4 
{
    public static int power(int n,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int res = power(n,pow-1);
        int result = res*n;
        return result;
    }
    public static void main(String[] args) {
        int n = 0;
        int pow = 3;
        int res = power(n,pow);
        System.out.println(res);
    }
    
}
