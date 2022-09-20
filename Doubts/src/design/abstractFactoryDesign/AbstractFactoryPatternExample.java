package design.abstractFactoryDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = br.readLine();
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);
//we are going to use abstract factory to act as 
//reference type for Bank factory object. 
//factory class AbstractFactory is abstract and BankFactory is a proper class 

		System.out.println("Enter the type of loan e.g. home loan or business loan or education loan : ");
		String loanName = br.readLine();
//enter teh bank name
		System.out.println("Enter the interest rate for " + b.getBankName() + ": ");
//enter the interest rate and loan amounnt for a loan 
		double rate = Double.parseDouble(br.readLine());
		System.out.println("Enter the loan amount you want to take: ");

		double loanAmount = Double.parseDouble(br.readLine());
		System.out.println("Enter the number of years to pay your entire loan amount: ");
		int years = Integer.parseInt(br.readLine());
		System.out.println("you are taking the loan from " + b.getBankName());
//abstractn factory is used for getting loan object , assing rate to loan object  
		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}
}// End

/*
 * FactoryCreator - public static AbstractFactory getFactory(String choice) -
 * gives BankFactory or LoanFactory object AbstractFactory abstract - getbank
 * and getLoan methods BankFactory class - it has implemented getBank and
 * getLoan methods Bank interface - getBankName() , Loan - getLoanName()
 * 
 */
