package assoc.aggregation;

import java.util.List;

/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */
class Department  
{ 
    String name; 
    private List<Student> students; 
    Department(String name, List<Student> students)  
    { 
        this.name = name; 
        this.students = students; 
    } 
      
    public List<Student> getStudents()  
    { 
        return students; 
    } 
} 