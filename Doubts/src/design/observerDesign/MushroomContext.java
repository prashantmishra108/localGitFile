package design.observerDesign;
public class MushroomContext {
        Subject subject = new Subject(); // Context has a subject
        Observer mario = new Mario(); // Context has a mario
		Observer bowser = new Bowser(); // Context has a bowser

    public MushroomContext() {
        subject.addObserver(mario);
        subject.addObserver(bowser);
    } 

    public void distributeMushrooms(int mushrooms) {
        subject.notifyAll(mushrooms);
    }

    public static void main(String[] args) {
        new MushroomContext().distributeMushrooms(10);
    }
}
