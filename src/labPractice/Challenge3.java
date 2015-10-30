package labPractice;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alyson
 */
public class Challenge3 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Smith", "Mickey", "111-11-1111");
        Employee e2 = new Employee("Jones", "Martha", "222-22-2222");
        Employee e3 = new Employee("Pond", "Amy", "333-33-3333");
        
        Dog d1 = new Dog("Patrick", 4321);
        Dog d2 = new Dog("Sponge Bob", 3214);
        Dog d3 = new Dog("Squidward", 2143);
        Dog d4 = new Dog("Mr. Crabs", 1234);
        
        List listOfThings = new ArrayList();
        
        listOfThings.add(e1);
        listOfThings.add(e2);
        listOfThings.add(e3);
        listOfThings.add(d1);
        listOfThings.add(d2);
        listOfThings.add(d3);
        listOfThings.add(d4);
        
        //Before overriding the toString method, this would only print out the package,
        //the class and the hash code - essentially the memory location of that object. 
        //When overriding the toString method, you can actually print out some useful
        //information about that object as seen when running the following code. 
        //The biggest challenge of having two different types of objects in the
        //list, without having any sort of common interface (DIP), there are no
        //common methods, or in other words, polymorphism doesn't exist and you
        //can't use liskovs substitution principle. 
        for(int i = 0; i < listOfThings.size(); i++){
            System.out.println(listOfThings.get(i).toString());
        }
        
        //ANOTHER way of going about this --- IF YOU KNOW OF THE CLASSES BEING 
        //PUT INTO THE LIST--- is to use an if statement inside the for loop. 
        //while this is probably not recommended and pretty fragile and dependent
        //on those classes, it is a way to go arouund the problem, IF, as I said
        //before, you theoretically know what classes are being used. This also 
        //blows the reusability of this code if you were to add say a Cat class.
        //While I did put this into the challenge, this is by no means a way I 
        //would go about completing this on a personal use level. Just using to 
        //show how much more difficult it is to access the class vs just using 
        //a custom toString method.
        for(int i = 0; i <  listOfThings.size(); i++){
            if(listOfThings.get(i).getClass() == common.Dog.class){
                Dog d = (Dog) listOfThings.get(i);
                System.out.println("Rabies ID: " + d.getRabiesId() + ", Name: " + d.getName() );
            }else if(listOfThings.get(i).getClass() == common.Employee.class){
                Employee e = (Employee) listOfThings.get(i);
                System.out.println("Name: " + e.getLastName() + ", " + e.getFirstName() + ", SSN: " + e.getSsn());
            }else{
                System.out.println(listOfThings.get(i).toString());
            }
        }
        
    }
    
}
