import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        // Country,Population
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion 
        map.put("India",30);
        map.put("USA",210);
        map.put("China",10);
        map.put("Russia",110);
        map.put("China",139);
        System.out.println(map);

        // Search
        if(map.containsKey("Chidna"))
        {
            System.out.println("Prsents");
        }
        else
        {
            System.out.println("Not Prsents");
        }

        // Key Exists 
        System.out.println(map.get("Chidna"));
        System.out.println(map.get("China"));

        // Iteration HashMap
        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Remove
        map.remove("China");
        
        // Iteration HashMap
        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    } 

    
   
    
}
