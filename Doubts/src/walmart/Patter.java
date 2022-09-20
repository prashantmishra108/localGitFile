package walmart;
//HRC high radius company
public class Patter {
	public static void main(String[] args) {
		int lastElement = 1, j = 0;
		for (int i = 1; i <= 4; i++) {
			while (j < i) {
				System.out.print(lastElement++ + "  ");
				j++;
			}
			j = 0;
			System.out.println();
		}
	}
}
