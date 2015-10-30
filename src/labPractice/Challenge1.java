package labPractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alyson
 */
public class Challenge1 {
    public static void main(String[] args) {
        List hobbies = new ArrayList();
        hobbies.add("Gaming");
        hobbies.add("Crochet");
        hobbies.add("Reading");
        
        for(int i = 0; i <  hobbies.size(); i++){
            String h = hobbies.get(i).toString();
            System.out.println(h);
        }
        
        hobbies.add("Yoga");
        hobbies.add("Meditation");
        hobbies.add("Web Development");
        
        System.out.println("\n");
        for(int i = 0; i <  hobbies.size(); i++){
            String h = hobbies.get(i).toString();
            System.out.println(h);
        }
        
        hobbies.remove("Meditation");
        hobbies.remove("Web Development");
        
        System.out.println("\n");
        for(int i = 0; i <  hobbies.size(); i++){
            String h = hobbies.get(i).toString();
            System.out.println(h);
        }
    }
}
