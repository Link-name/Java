package Lesson_3;
// Заполнить список десяти случайными числами
// Отсортировать список методом sort() и вывести на экран

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class tesk_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random random = new Random();
    for(int i = 0; i<10; i++){
        list.add(random.nextInt(1,10));
    }
    Collections.sort(list);
    System.out.print(list);
    }
    
}
