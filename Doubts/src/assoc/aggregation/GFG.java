package assoc.aggregation;

import java.util.ArrayList;
import java.util.List;

//main method 
class GFG 
{ 
 public static void main (String[] args)  
 { 
     Student s1 = new Student("Mia", 1, "CSE"); 
     Student s2 = new Student("Priya", 2, "CSE"); 
     Student s3 = new Student("John", 1, "EE"); 
     Student s4 = new Student("Rahul", 2, "EE"); 
   
     // making a List of  
     // CSE Students. 
     List <Student> cse_students = new ArrayList<Student>(); 
     cse_students.add(s1); 
     cse_students.add(s2); 
       
     // making a List of  
     // EE Students 
     List <Student> ee_students = new ArrayList<Student>(); 
     ee_students.add(s3); 
     ee_students.add(s4); 
       
     Department CSE = new Department("CSE", cse_students); 
     Department EE = new Department("EE", ee_students); 
       
     List <Department> departments = new ArrayList<Department>(); 
     departments.add(CSE); 
     departments.add(EE); 
       
     // creating an instance of Institute. 
     Institute institute = new Institute("BITS", departments); 
       
     System.out.print("Total students in institute: "); 
     System.out.print(institute.getTotalStudentsInInstitute()); 
 } 
} 

/*Aggregation

Institute has list of many departments, and Each department as list of many students.
It is a special form of Association where:

It represents Has-A relationship.
It is a unidirectional association i.e. a one way relationship. 
For example, department can have students but vice versa is not
 possible and thus unidirectional in nature.
In Aggregation, both the entries can survive individually which
 means ending one entity will not effect the other entity*/