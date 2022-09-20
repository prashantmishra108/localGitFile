package adapterpattern.NavinReddy;

public class AssignmentWork {
	PenInterface p;
	public void setPen(PenInterface p) {
		// TODO Auto-generated method stub
		this.p=p;
	}

	public void write(String string) {
		// TODO Auto-generated method stub
		p.write(string);
	}

	
}
