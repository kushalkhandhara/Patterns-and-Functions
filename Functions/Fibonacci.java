public class Fibonacci
{
    public static void main(String[] args) 
    {
        int n = 10; // Change this value to generate the series up to different lengths
        int first = 0, second = 1, next;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) 
        {
            if (i <= 1) 
            {
                System.out.print(i + " "); // Print 0 and 1 separately
            } 
            else 
            {
                next = first + second;
                first = second;
                second = next;
                System.out.print(next + " "); // Print the rest of the series
            }
        }
    }
}
