package Automation_Test_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "grape"};
        List<String> list = Arrays.asList(array);
       System.out.println("Array: " + Arrays.toString(array));
      System.out.println("List: " + list);
         
      int[] d1 = {1,1,2,3,4,12,3,13,12,13,6,4,6,3,5,2,8,9};
      int[] uniqueArray = IntStream.of(d1)
              .distinct().sorted()
              .toArray();
      System.out.println(Arrays.toString(uniqueArray));
      
      
      String []arr= {"devendra","devendra","ap","Ts","Ts","Ka"};
      
 List<String> d3=  Arrays.asList(arr);
 d3.stream().distinct().sorted().forEach(s->System.out.println(s));

      
      
      
 
 
 
      
    }
    
    
}
