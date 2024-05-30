class Pattern8
{
    public static void main(String[] args)
    {
        int rows = 5;
        int sum = 1;
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<=i; j++)
            { 
                System.out.print(sum);
                sum += 1;
            }
            System.out.println();
        }
    }
}