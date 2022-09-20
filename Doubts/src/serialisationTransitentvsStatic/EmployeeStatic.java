package serialisationTransitentvsStatic;

import java.io.Serializable;

public class EmployeeStatic extends superEmployeeStatic {
	  public String firstName;
	  private static final long serialVersionUID = 5462223600l;
	}
	class superEmployeeStatic implements Serializable {
	  public String lastName;
	  /*
	   * Here i am providing the value of company name,companyCEO and address
	   * while defining these variables.
	   */
	  static String companyName = "TATA";
	  transient String address = "DEL";
	  static transient String companyCEO = "Jayshree";
	}