package design.abstractFactoryDesign;

public class BankFactory extends AbstractFactory{  
	   public Bank getBank(String bank){  
		      if(bank == null){  
		         return null;  
		      }  
		      if(bank.equalsIgnoreCase("HDFC")){  
		         return new HDFC();  
		      }  
		      return null;  
		   }  
		  public Loan getLoan(String loan) {  
		      return null;  
		   }  
		}//End