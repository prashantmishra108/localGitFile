package hashcodesEmp;

import java.util.HashMap;
import java.util.HashSet;
//https://stackoverflow.com/questions/2265503/why-do-i-need-to-override-the-equals-and-hashcode-methods-in-java

public class HashCodeEmployee implements ab{
   public static void main(String[] args) {
        Employee employee = new Employee("rajeev", 24);
        System.out.println("1");
        Employee employee1 = new Employee("rajeev", 25);
        System.out.println("2");
        Employee employee2 = new Employee("rajeev", 24);
        System.out.println("3");
        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        employees.add(employee2);
        System.out.println("4 employees.size="+employees.size());
        System.out.println("contains= "+employees.contains(employee2));
        System.out.println("employee.hashCode():" + employee.hashCode()
         + "\nemployee2.hashCode():" + employee2.hashCode());
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        hmap.put("rajeev", 24);hmap.put("rajeev", 25);
        System.out.println(hmap.values());
    }
}

interface ab{}
/* Now can you see why if two objects are considered equal, their hashcodes must also be equal?
 *  Otherwise, you'd never be able to find the object since the default hashcode method in class 
 *  Object virtually always comes up with a unique number for each object, even if the equals()
 *   method is overridden in such a way that two or more objects are considered equal. It doesn't 
 *   matter how equal the objects are if their hashcodes don't reflect that. So one more time: 
 *   If two objects are equal, their hashcodes must be equal as well.*/
 