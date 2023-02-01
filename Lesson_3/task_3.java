package Lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// Вывести название каждой планеты и количество его повторений в списке
public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Random random = new Random();
    for(int i = 0; i<10; i++){
        list.add(random.nextInt(1,10));
    }
    Collections.sort(list);
    System.out.println(list);
    int count = 1;
    for (int i = 0; i < list.size()-1; i++) {
       if (list.get(i)==list.get(i+1)){
        count++;
        
       }
       else{
        System.out.print(list.get(i));
        System.out.println("="+ count);
        count=1;
        }
    }
    System.out.print(list.get(list.size()-1));
    System.out.printf("-%s; ", count);
    Set<Integer> numbers = new TreeSet<Integer>(list);// убераем повторяющие элементы
    System.out.println(numbers);
}   

}