
package project.pkg14;

import java.util.ArrayList;
import java.util.List;

public class Project14 {

  
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(-5);
        myList.add(4);
        myList.add(3);
        myList.add(-8);
        myList.add(9);
        myList.add(10);
        myList.add(-21);
        myList.add(72);
        myList.add(-12);
        
        double sum = 0.0;
        for (int i = 0; i < myList.size();i++) {
            sum = sum + i;
        }
     System.out.println("Square root is " + Math.sqrt(sum));
     System.out.println("Sum is " + sum);
      System.out.println("Avereage is " + sum/10);
        
    }
    
}
