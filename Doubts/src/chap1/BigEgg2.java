package chap1;
class Egg2 {

protected class Yolk {
public Yolk() { System.out.println("Egg2.Yolk()"); }//-1
//public void f() { System.out.println("Egg2.Yolk.f()");}
}

private Yolk y = new Yolk();
public Egg2() { System.out.println("New Egg2()"); }//0
//public void insertYolk(Yolk yy) { y = yy; System.out.print("insert yolk egg2| ");}//2
//public void g() { y.f(); }
}

public class BigEgg2 extends Egg2 {
public class Yolk extends Egg2.Yolk {
public Yolk() { System.out.println("BigEgg2.Yolk()"); }//1
//public void f() { System.out.println("BigEgg2.Yolk.f()"); }//4
}

public BigEgg2() { /*insertYolk(new Yolk());*/System.out.print("be2"); }//3
public static void main(String[] args) {
Egg2 e2 = new BigEgg2();
//e2.g();
}
} 
/* Output:
Egg2.Yolk()
New Egg2()
Egg2.Yolk()
BigEgg2.Yolk()
insert yolk egg2| be2BigEgg2.Yolk.f()
*///:~