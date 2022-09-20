package assoc;
//https://www.geeksforgeeks.org/association-composition-aggregation-java/
//Association between both the classes in main method 
class Association  
{ 
 public static void main (String[] args)  
 { 
     Bank bank = new Bank("Axis"); 
     Employee emp = new Employee("Neha"); 
       
     System.out.println(emp.getEmployeeName() +  
            " is employee of " + bank.getBankName()); 
 } 
} 
/*Association
Output Explanation: In the above example, two separate classes Bank and 
Employee are associated through their Objects. Bank can have many employees, 
So it is a one-to-many relationship.

Association is relation between two separate classes which 
establishes through their Objects. Association can be one-to-one,
 one-to-many, many-to-one, many-to-many.
In Object-Oriented programming, an Object communicates to 
other Object to use functionality and services provided by that 
object. Composition and Aggregation are the two forms of 
association.*/