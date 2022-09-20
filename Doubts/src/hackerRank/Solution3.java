package hackerRank;
// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;
import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Trie3 trie = new Trie3();
        for (int i = 0; i < n; i++) {
            String operation = scan.next();
            String contact   = scan.next();
            if (operation.equals("add")) {
                trie.add(contact);
            } else if (operation.equals("find")) {
                System.out.println(trie.find(contact));
            }
        }
        scan.close();
    }
}

/* Based loosely on tutorial video in this problem */
class Trie3Node {
    private HashMap<Character, Trie3Node> children = new HashMap<>();
    public int size = 0; // this was the main trick to decrease runtime to pass tests.

    public void putChildIfAbsent(char ch) {
        children.putIfAbsent(ch, new Trie3Node());
    }

    public Trie3Node getChild(char ch) {
        return children.get(ch);
    }
}

class Trie3 {
    Trie3Node root = new Trie3Node();

    Trie3(){} // default constructor
    
    Trie3(String[] words) {
        for (String word : words) {
            add(word);
        }
    }
    
    public void add(String str) {
        Trie3Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            curr.putChildIfAbsent(ch);
            curr = curr.getChild(ch);
            curr.size++;
        }
    }
    
    public int find(String prefix) {
        Trie3Node curr = root;
        
        /* Traverse down tree to end of our prefix */
        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            curr = curr.getChild(ch);
            if (curr == null) {
                return 0;
            }
        }
        return curr.size;
    }
}
