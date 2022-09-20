package Oracke;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

class Test {
	static int string, integer, flt, dbl, lng;

	public static void main(String[] args) {
		try {
			studentinfo sinull = new studentinfo("Abhi", 104, "110044",null);
			studentinfo si = new studentinfo("Ram", 108, "210044",sinull);
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.flush();
			oos.close();
			fos.close();
			File file = new File("student.txt");
			// InputStream is = new InputStream();

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(fis);
			Object o = ois.readObject();
			new Test().fieldType(o);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// stringContains("mememe", "me");
	}

	public static void stringContains(String a, String b) {
		int count1 = a.length();
		int count2 = b.length();
		int flag = 0, found = 0;
		for (int i = 0; i <= count1 - count2; i++) {
			for (int j = i; j < i + count2; j++) {
				flag = 1;
				if (a.charAt(j) != b.charAt(j - i)) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				found++;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("successful" + found);
		} else {
			System.out.println("unssss");
		}
	}

	void calculateType(Field f) {
		if (f.getType().toString().contains("String")) {
			string++;
		} else if (f.getType().toString().contains("int")) {
			integer++;
		} else if (f.getType().toString().contains("Float")) {
			flt++;
		} else if (f.getType().toString().contains("Double")) {
			dbl++;
		} else if (f.getType().toString().contains("Lng")) {
			lng++;
		}
		System.out.println("String=" + string + " Int=" + integer + "  flt=" + flt + " dbl=" + dbl + " lng=" + lng);
	}

	void fieldType(Object o) {
		for (Field f1 : o.getClass().getDeclaredFields()) {
			if (f1.getType().toString().contains("studentinfo")) {
				fieldType(f1);
			} else {
				Field[] f2= o.getClass().getDeclaredFields();
				int i=0;
				//for(Field type= f2[i];type.toString().contains("");) 
				new Test().calculateType(f1);
				System.out.println(f1.getType());
			}
		}
	}
}