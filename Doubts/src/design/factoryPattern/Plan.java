package design.factoryPattern;

abstract class Plan{  
protected double rate;    //use a variable in abstract class
abstract void getRate();  // use getRate abstract method
public void calculateBill(int units){  //use calculate Bill method which process the bill with help of its parameter
     System.out.println(units*rate);  
}  
}
