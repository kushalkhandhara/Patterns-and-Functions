//     1
//    212
//   32123
//  4321234
// 543212345

class Pattern4
{
    public static void main(String[] args)
    {
        int rows = 5;
        int sum1,sum2;
        for (int i = 1; i <= rows; i++)
        {
            for(int j=1;j<=(rows-i);j++)
            {
                System.out.print(" ");
            }

            for(int k=i;k>0;k--)
            {
                sum1 = k;
                System.out.print(sum1);
                sum1 = 1;
            }
            for(int l = 2; l<i+1; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}