package best;

import java.util.logging.Logger;

// Simple example of overriding clone() method in Java to understand How Cloning
// of Object works in Java.

public class JavaCloneTest {
	private static final Logger logger = Logger.getLogger("JavaCloneTest.class");

	public static void main(String args[]) {
		Rectangle rec = new Rectangle(30, 60);
		Rectangle copy = null;
		try {
			logger.info("Creating Copy of this object using Clone method");
			copy = rec.clone();
			logger.info("Copy " + copy);

		} catch (CloneNotSupportedException ex) {
			// logger.debug("Cloning is not supported for this object");
		}

		// testing properties of object returned by clone method in Java
		logger.info("copy != rec : " + (copy != rec));
		logger.info("copy.getClass() == rec.getClass() : " + (copy.getClass() == rec.getClass()));
		logger.info("copy.equals(rec) : " + copy.equals(rec));
		logger.info("copy==rec : " + (copy == rec));

		// Updating fields in original object
		rec.setHeight(100);
		rec.setWidth(45);

		logger.info("Original object :" + rec);
		logger.info("Clonned object  :" + copy);
	}

}

class Rectangle implements Cloneable {
	private int width;
	private int height;

	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return width * height;
	}

	@Override
	public String toString() {
		return String.format("Rectangle [width: %d, height: %d, area: %d]", width, height, area());
	}

	@Override
	protected Rectangle clone() throws CloneNotSupportedException {
		return (Rectangle) super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Rectangle other = (Rectangle) obj;
		if (this.width != other.width) {
			return false;
		}
		if (this.height != other.height) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 47 * hash + this.width;
		hash = 47 * hash + this.height;
		return hash;
	}

}
