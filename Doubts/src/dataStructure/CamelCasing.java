package dataStructure;

public class CamelCasing {

	static String toCamelCase(String s) {
		String[] parts = s.split(" ");
		String camelCaseString = "";
		for (String part : parts) {
			if (part != null && part.trim().length() > 0)
				camelCaseString = camelCaseString + toProperCase(part);
			else
				camelCaseString = camelCaseString + part ;
		}
		return camelCaseString;
	}

	static String toProperCase(String s) {
		String temp = s.trim();
		String spaces = "";
		if (temp.length() != s.length()) {
			System.out.println("temp");
			int startCharIndex = s.charAt(temp.indexOf(0));
			spaces = s.substring(0, startCharIndex);
		}
		temp = temp.substring(0, 1).toUpperCase() + spaces + temp.substring(1).toLowerCase() + " ";
		return temp;

	}

	public static void main(String[] args) {
		String string = "HI tHiS   a   is   SomE Statement";
		System.out.println(toCamelCase(string));
		String s = " boo boo";
		String [] a = s.split(" ");//trailing string matched are taken into array as blank without space. 
		System.out.println();
	}
}