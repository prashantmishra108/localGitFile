package com.wipro.user;

public class Employee implements Comparable {
    private String name;
    private String id;
    private String salary;
 
    public Employee(){
    	
    }
    
    public Employee(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getSalary() {
        return salary;
    }
 
    public void setSalary(String salary) {
        this.salary = salary;
    }
 
    public int compareTo(Employee emplyoee) {
        String compareSalary = ((Employee) emplyoee).getSalary();
        int salary = Integer.parseInt(this.salary);
        int compareSal = Integer.parseInt(compareSalary);
        // ascending order
        // return (int) (this.salary - compareSalary);
 
        // descending order
        return (int) (compareSal - salary);
    }
 
    @Override
    public String toString() {
        return "[ id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
 
}