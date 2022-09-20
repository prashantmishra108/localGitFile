package chap5;

public class subsuper {
public static void main(String[] args) {
	subsuper superobj = new subsuper();
	subsuper subobj = new subb();
	superobj = subobj ;
}
}
class subb extends subsuper{
	
}
