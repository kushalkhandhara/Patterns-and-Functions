// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

class Pattern1
{
    public static void main(String[] args)
    {
        int rows = 4;
        for(int i = 1; i<=rows; i++) 
        {
            // First Half
            for(int k = 1; k<=i ; k++)
            {
                System.out.print("*");
            }

            for(int j = 1; j<=(rows-i)*2; j++)
            {
                System.out.print(" ");
            }

            for(int l = 1; l<=i ; l++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second Half
        for(int m = rows; m>0 ;m--)
        {
            for(int n=0; n<m; n++)
            {
                System.out.print("*");
            }
            for(int o=0; o<(rows-m)*2;o++)
            {
                System.out.print(" ");
            }
            for(int p=0; p<m; p++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}