// Conversion of Binary To Integer;

import java.util.Scanner;

public class BinaryToDecimal 
{
    public static int binarytoNum(String bin)
    {
        int result = 0;
        int len = bin.length();
        int j = 0;

        for(int i = len-1; i>=0; i--)
        {
            if(bin.charAt(i) == '1')
            {
                String b = String.valueOf(bin.charAt(i));
                int a =  Integer.parseInt(b);

                int pow = powerOf2(a,j);
                result += pow;
                j++;
            }
            else
            {
                result+=0;
                j++;
            }
        }
        return result;
    }
    public static int powerOf2(int a, int i)
    {
        if(i==0)
        {
            return 1;
        }
        else
        {
            for(int j = 0; j < i; j++)
            {
                a*=2;
            }
            return a;
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String binary;
        
        System.out.println("Enter Binary Number : ");
        binary = scanner.next();

        int num = binarytoNum(binary);
        System.out.println("Number : "+num);
        
        scanner.close();

        
    }
    
}
