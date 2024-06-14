import java.util.HashSet;
import java.util.Iterator;
public class Hashing
{
    public static void main(String[] args) 
    {
        // Creating  
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        // Set Will Not have Duplicates it will have unique elements hence the one we add will not add the set will have only one 1

        // Search -contains
        if(set.contains(1))
        {
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6))
        {
            System.out.println("Set Not Contains 6");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("Set Not Contains 1");

        }

        System.out.println("Set Size : "+set.size());
        System.out.println("Set : "+set);

        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println("Iteration : "+it.next());
        }

    }
}