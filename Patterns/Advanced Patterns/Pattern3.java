//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

class Pattern3
{
    public static void main(String[] args)
    {
        int sum = 1;
        int rows = 5;

        for(int i=1; i<=rows; i++)
        {
            for(int j = 1; j<=(rows-i); j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i; k++)
            {
                System.out.print(sum+" ");
            }
            sum += 1;
            System.out.println();


        }
    }
}