package chap3;

import java.util.Arrays;

public class splitting {
public static String knights =
"Then, when youn...44 have the forest...";
public static void split(String regex) {
System.out.println(
Arrays.toString(knights.split(regex)));
}
public static void main(String[] args) {
split(" "); // Doesn’t have to contain regex chars
split("\\W+"); // Non-word characters
split("n\\W+"); // ‘n’ followed by non-word characters
split("\\w");
}
} 