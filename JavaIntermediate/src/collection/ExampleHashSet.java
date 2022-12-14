package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("D");
        hashSet.add("F");
        hashSet.add("F"); 
        
        //does it contain
        System.out.println("HashSet contains B true/false -->"+hashSet.contains("B")); 
        
        //empty check
        System.out.println("is emtpy true/false "+hashSet.isEmpty());
        
        //hashset size
        if (hashSet.size() == 0 ){
            System.out.println("HashSet is empty");
        }
        else {
            System.out.println("is "+hashSet.size()+" things long");
        }
        
        System.out.println(hashSet);
        //remove item
        hashSet.remove("A");
        System.out.println("HashSet without A -->"+hashSet);


      
        
        //iterate through and remove
        Iterator<String> setIterator = hashSet.iterator();
        while (setIterator.hasNext()){
            String obj = setIterator.next();
            System.out.println(obj);
            setIterator.remove();
        }
        
        if (hashSet.size() == 0 ){
            System.out.println("HashSet is empty after iterator cleared hashset");
        }
        else {
            System.out.println(hashSet.size()+" things long");
        }
        
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("D");
        hashSet.add("F");
        hashSet.add("F"); 
        
        if (hashSet.size() == 0 ){
            System.out.println("HashSet is empty");
        }
        else {
            System.out.println(hashSet.size()+" things long");
        }
        
        //clear hashset
        hashSet.clear();
        
        //hashset size
        if (hashSet.size() == 0 ){
            System.out.println("HashSet is empty afer clear");
        }
        else {
            System.out.println(hashSet.size());
        }
        
   
        
        
        
    }
}
