package PrototypePattern;
// Employee records of oracle corporation.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class PrototypeDemo{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid=Integer.parseInt(br.readLine());
        System.out.print("\n");
        
        System.out.print("Enter Employee Name: ");
        String ename=br.readLine();
        System.out.print("\n");
        
        System.out.print("Enter Employee Designation: ");
        String edesignation=br.readLine();
        System.out.print("\n");
        
        System.out.print("Enter Employee Address: ");
        String eaddress=br.readLine();
        System.out.print("\n");
        
        System.out.print("Enter Employee Salary: ");
        double esalary= Double.parseDouble(br.readLine());
        System.out.print("\n");
         
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);
        
        //e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        //e2.setId(25);
        System.out.println(e1.getId()+""+e1.equals(e2));

        System.out.println(e1 == e2);
        e2.showRecord();
    }   
}//End of the ProtoypeDemo class.
