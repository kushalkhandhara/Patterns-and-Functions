// Most Important
// Get Subsquences


public class Recursion4 {
    public static void  Subsequences(String s,int i,String new1)
    {
        if(i==s.length())
        {
            System.out.println(new1);
            return;
        }
        // TO be
        Subsequences(s,i+1,new1+s.charAt(i));   
        
        // Not to be
        Subsequences(s,i+1,new1);

    }

    public static void main(String args[]) 
    {
        String s= "abc";
        Subsequences(s,0,"");

    }
}