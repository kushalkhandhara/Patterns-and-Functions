class Pattern5
{
    public static void main(String[] args)
    {
        int rows = 6;
        int div = rows/2;

        // First Half
        for(int i = 1; i<=div; i++) 
        {
            for(int j = 1;j<=(div-i);j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print("*");
            }
            for(int l=2;l<i+1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    

        // Second Half
        for(int m =div;m>0;m--) 
        {
            for(int n=1; n<=(div-m); n++)
            {
                System.out.print(" ");
            }
            for(int o = 1;o<=m; o++)
            {
                System.out.print("*");
            }
            for(int p=1; p<=(m-1); p++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}