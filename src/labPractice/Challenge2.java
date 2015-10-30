package labPractice;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alyson
 */
public class Challenge2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Mickey", "111-11-1111");
        Employee e2 = new Employee("Jones", "Martha", "222-22-2222");
        Employee e3 = new Employee("Pond", "Amy", "333-33-3333");
        
        
        
        List<Employee> employee = new ArrayList<Employee>();
        
//        Employee(int empID, String lastName, String firstName, String ssn)
        
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        
        for(Employee em : employee){
            System.out.println(em.getFirstName() + " " + em.getLastName() + ", SSN: " + em.getSsn());
        }
    }
    
}
