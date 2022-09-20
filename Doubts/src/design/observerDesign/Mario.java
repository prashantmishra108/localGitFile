package design.observerDesign;

public class Mario implements Observer {
    private int mushrooms = 0; // Mario has mushrooms

    public void update(Object someObject) {
        int newMushrooms = (Integer) someObject;
        mushrooms += newMushrooms;
        System.out.println("Mario just found " + newMushrooms + " mushrooms!");
        System.out.println("Where the fuck did they come from?");
    }
}