// Put The x at the end of string

public class Recursion3 
{
    public static void RemoveX(String s,int i,String new1,String new2)
    {
       
        if(i==s.length()-1)
        {
            String new3=new1+new2;
            System.out.println(new3);
            return;
            
        }
        if(s.charAt(i)!='x')
        {
            new1+=s.charAt(i);
        }
        else
        {
            new2+=s.charAt(i);
        }
        i++;
        RemoveX(s, i, new1,new2);
       
    }
    public static void main(String[] args) 
    {
        String s = "axxxxfxd";
        RemoveX(s,0,"","");
    }
    
}
