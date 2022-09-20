package serialisationTransitentvsStatic;

import java.io.Serializable;
public class Employee extends superEmployee {
  public String firstName;
  private static final long serialVersionUID = 5462223600l;
}
class superEmployee implements Serializable{
  public String lastName;
  static  String companyName = "Ramu Statics";
  transient  String address = "Address Transient";
  static transient String companyCEO = "Static Transient CompanyCEO";
}