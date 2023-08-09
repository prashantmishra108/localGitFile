package EffectiveJava.project1;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class WordList {
public static void main(String[] args) {
 String[]args1 ={"tiger","shyam","ram"};
Set<String> s = new TreeSet<>();
Collections.addAll(s, args1);
System.out.println(s);
}
}