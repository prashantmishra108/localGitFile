package EffectiveJava.project1;
//implements Cloneable is used to clone otherwise no cloning will 
//happen if the clone method return type is Specific classname
//if clone() md return type is Object then impplement clone is not needed
public class Student18Clone implements Cloneable{  
int rollno;  
final String name;  //public void setName(String name) {this.name=name;}  
public Student18Clone(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}    
public Student18Clone clone() throws CloneNotSupportedException{  
return (Student18Clone)super.clone();  
}    
public static void main(String args[]){  
try{  
Student18Clone s1=new Student18Clone(101,"amit");  
  
Student18Clone s2=(Student18Clone)s1.clone();  
  s1.rollno=82;
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
System.out.println(s1.name==s2.name); //name is final
System.out.println(s1.rollno==s2.rollno);  
}catch(CloneNotSupportedException c){}  
  
}  
}