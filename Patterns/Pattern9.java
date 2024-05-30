class Pattern9
{
    public static void main(String[] args) 
    {
        int rows = 5;
        int one = 1;
        int zero = 0; 
        for(int i = 0 ; i<5; i++)
        {
            for(int j = 0 ; j<=i ; j++)
            {
                if(i%2==0)
                {
                    if(j%2==0)
                    {
                        System.out.print(1);
                    }
                    else
                    {
                        System.out.print(0);
                    }
                }
                else
                {
                    if(j%2==0)
                    {
                        System.out.print(0);
                    }
                    else
                    {
                        System.out.print(1);
                    }
                } 
            }
            System.out.println();
        }
    }
}