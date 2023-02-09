package test;

import java.util.ArrayList;
import java.util.HashMap;

public class test8 {
    public static void main(String[] args) {
        
    HashMap<String, ArrayList<Integer>> phoneNumber = new HashMap<String, ArrayList<Integer>>();
    String key = "abc";
    int value = 123;
    if (phoneNumber.containsKey(key)) {
        phoneNumber.get(key).add(value);
    } 
    else {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
        arrayList.add(value);
        phoneNumber.put(key, arrayList);
    }
    System.out.println(phoneNumber);
}  

}
