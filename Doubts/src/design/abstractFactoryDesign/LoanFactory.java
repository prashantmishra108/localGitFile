package design.abstractFactoryDesign;

public class LoanFactory extends AbstractFactory{  
    public Bank getBank(String bank){  
        return null;  
   }  
	public Loan getLoan(String loan){  
	if(loan == null){  
	 return null;  
	}  
	if(loan.equalsIgnoreCase("Home")){  
	 return new EducationLoan();  
	}  
	return null;  
	}  
}