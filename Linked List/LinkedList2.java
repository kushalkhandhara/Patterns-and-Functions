import java.util.*;
public class LinkedList2 
{
    public static void main(String[] args) 
    {
        LinkedList<String>  list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("b");
        System.out.println(list);
        
        list.addLast("sd");
        list.addLast("f3");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
