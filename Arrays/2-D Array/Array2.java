// Transpose Matrix

import java.util.*;
public class Array2 
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Rows ");
      int n = sc.nextInt();
      System.out.println("Enter Columns");
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
       int transmatrix[][] = new int[n][m];
      System.out.println("Enter Matrix Inputs : ");
      for(int i=0; i<n; i++) 
      {
           for(int j=0; j<m; j++) 
           {
               matrix[i][j] = sc.nextInt();
           }
      }
        System.out.println("Transpose MAtrix ");
      for(int i=0; i<n; i++) 
      {
           for(int j=0; j<m; j++) 
           {

               transmatrix[i][j] = matrix[j][i];
           }
      }

      for(int i=0; i<n; i++) 
      {
           for(int j=0; j<m; j++) 
           {
              System.out.print(transmatrix[i][j] + " ");
           }
           System.out.println();
      }
    }
}