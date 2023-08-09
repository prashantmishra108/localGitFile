package EffectiveJava.project1;

import java.util.HashMap;

class Key { 
    String key; 
    Key(String key) 
    { 
        this.key = key; 
    } 
  
  /*  @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Key)obj).key); 
    } */
} 
  
// Driver class 
public class GFGHashMap { 
    public static void main(String[] args) 
    { 
        HashMap map = new HashMap(); 
        Key key1 = new Key("xx"); Key key2 = new Key("xx");
        map.put(key1, 20);
        map.put(new Key("v ishal"), 20); 
        map.put(new Key("sachin"), 30); 
        map.put(new Key("vaibhav"), 40); 
        Integer i = new Integer(110);
       // System.out.println("Value for key Key1: " + key1.hashCode()+" "+key2.hashCode());   
       // System.out.println("Value for key Key1: " +i.hashCode() +" "+ map.get(key1).hashCode());
        System.out.println(map.containsKey(new Key("vaibhav"))); 
        System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav"))); 
        System.out.println("Value for key vishal: " + map.get(new Key("vishal"))); 
      } 
} 