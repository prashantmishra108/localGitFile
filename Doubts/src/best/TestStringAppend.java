package best;
	public class TestStringAppend 
	{
	    public static void main(String[] args)
	    {
	        StringBuilder s1 = new StringBuilder("Java");
	        String s2 = "Love";int i=10;double d=20.00;
	        s1.append(i);s1.append(d);
	       /* s1.substring(4);
	       */ int foundAt = s1.indexOf(s2);
	        System.out.println(foundAt+" "+s1);
	    }
	}
