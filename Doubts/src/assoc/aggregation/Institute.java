package assoc.aggregation;

import java.util.List;

/* Institute class contains list of Department 
Objects. It is associated with Department 
class through its Object(s).*/
class Institute  
{ 
      
    String instituteName; 
    private List<Department> departments; 
      
    Institute(String instituteName, List<Department> departments) 
    { 
        this.instituteName = instituteName; 
        this.departments = departments; 
    } 
      
    // count total students of all departments 
    // in a given institute  
    public int getTotalStudentsInInstitute() 
    { 
        int noOfStudents = 0; 
        List<Student> students;  
        for(Department dept : departments) 
        { 
            students = dept.getStudents(); 
            for(Student s : students) 
            { 
                noOfStudents++; 
            } 
        } 
        return noOfStudents; 
    } 
      
} 