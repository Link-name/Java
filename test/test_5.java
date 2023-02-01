package test;

import java.util.ArrayList;
import java.util.Random;

public class test_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Random random = new Random();
    for(int i = 0; i<list.size(); i++){
        list.add(random.nextInt(1,10));
    }
    System.out.println(list);
}   
}
