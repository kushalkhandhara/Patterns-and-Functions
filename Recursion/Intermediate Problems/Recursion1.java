// Reverse The String
public class Recursion1 
{
    public static void reverse(String s,String add,int last)
    {
        if(last==-1)
        {
            System.out.println(add);
            return;
        }

        add+=s.charAt(last);
        last--;
        reverse(s, add, last);
    }
    public static void main(String[] args)
    {
        String add="";
        String s = "abcd";
        int len =s.length()-1;
        reverse(s,add,len);
        
    
    } 
    
}
