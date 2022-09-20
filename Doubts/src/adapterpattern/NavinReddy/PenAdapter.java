package adapterpattern.NavinReddy;

public class PenAdapter implements PenInterface
{
	PilotPen p = new PilotPen();
	public void write(String s) {
		p.write(s);
	}
}
