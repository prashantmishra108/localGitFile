package adapterpattern.NavinReddy;

public class SchoolMain {
	
	public static void main(String[] args) {
		
		PenInterface p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(p);
		aw.write("Tired to work");
	}
}
