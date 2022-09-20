package best;

import java.lang.reflect.Field;

import sun.reflect.Reflection;

public class reflection1 {
public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	Field a = Removeduplicates.class.getDeclaredField("j");
	int b = a.getInt(Removeduplicates.class);
	System.out.println(b);
}
}
