package best;

import java.util.ArrayList;
import java.util.List;

interface ListMethods0 {
	public void x();
}

class ListMethods1 implements ListMethods0 {
	public void x() {
	}

	public void y() {
	}
}

public class ListMethods extends ListMethods1 {
	public static void main(String[] args) {
		List<ListMethods0> list0 = new ArrayList();
//list0.//add(new ListMethods1());
		List alist = new ArrayList<String>();
		String s = "s";
//list0.add(new ListMethods1());
		List<String> onlylist = new ArrayList<String>();
		onlylist.add("tiger");

	}
}
