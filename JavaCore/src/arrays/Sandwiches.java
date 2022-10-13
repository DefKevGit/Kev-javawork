package arrays;
import java.util.ArrayList;


public class Sandwiches{
    public static void main(String[] args){
        ArrayList<String> sandwiches = new ArrayList<>();
        
        sandwiches.add("bread sandwich");
        sandwiches.add("pop tart");
        sandwiches.add("hot dog");

        System.out.println(sandwiches);
        
        
        System.out.println(sandwiches.get(1));
        
        sandwiches.set(0, "ice cream taco");
        System.out.println(sandwiches);
        
        sandwiches.remove(0);
        System.out.println(sandwiches);

        System.out.println(sandwiches.size());

        
        
        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println(sandwiches.get(i));
        }
        
        for (String i : sandwiches){
            System.out.println(i);
        }
        sandwiches.clear();
        System.out.println(sandwiches);
        
        
        
        
        
        
    }
}