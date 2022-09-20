package design.bridgeDesign;
public class TestBridgePattern {
/*BigWheel is having product Obj and String carType. super initialiser in BigWheel sends the objects to Car constructor.
   
  
 */
	public static void main(String[] args) {
		Product product = new CentralLocking("Central Locking System");
		Car car = new BigWheel(product , "BigWheel xz model");
		car.produceProduct();//assemble and produceProduct are BigWheel methods
		car.assemble();
		car.printDetails();//this is Car class method
		
		System.out.println("---------");
		Product product2 = new GearLocking("Gear Locking System");
		car = new BigWheel(product2 , "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
	
		System.out.println("-----------------------------------------------------");
		
		/*car = new Motoren(product, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		System.out.println("--------");
		
		car = new Motoren(product2, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
			*/

	}

}
