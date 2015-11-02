package labPractice;

import common.Employee;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Alyson
 */
public class Challenge4 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Mickey", "111-11-1111");
        Employee e2 = new Employee("Jones", "Martha", "222-22-2222");
        Employee e3 = new Employee("Pond", "Amy", "333-33-3333");
        Employee e4 = new Employee("Pond", "Rory", "444-44-4444");
        Employee e5 = new Employee("Song", "River", "555-55-5555");
        Employee e6 = new Employee("Malone", "Melody", "555-55-5555");
        Employee e7 = new Employee("Pond", "Melody", "555-55-5555");

        Set<Employee> emps = new LinkedHashSet<Employee>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e7);
        emps.add(e3);
        emps.add(e6);
        emps.add(e4);
        emps.add(e5);

        //As long as equals and hashcode methods are overriden, it will get rid
        //of any duplicates. I overrode the SSN since some people could have the 
        //same names but no be the same people. 
        for (Employee e : emps) {
            System.out.println(e);
        }
    }

}
