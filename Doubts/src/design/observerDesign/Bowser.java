package design.observerDesign;
public class Bowser implements Observer {
    private int mushrooms = 10; // Bowser has mushrooms

    public void update(Object someObject) {
        int newMushrooms = (Integer)someObject;
        mushrooms -= newMushrooms;
        System.out.println("Bowser just lost " + newMushrooms + " mushrooms!");
        System.out.println("Where the fuck did they disappear to?");
    }
}