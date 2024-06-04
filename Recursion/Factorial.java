public class Factorial 
{
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        int fact_nm = fact(n-1);
        int fact_n = n*fact_nm;
        return fact_n;

    }

    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.println(res);
    }
    
}
