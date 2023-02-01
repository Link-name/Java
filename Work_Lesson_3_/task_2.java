package Work_Lesson_3_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Создать список целых чисел (заполнить случайными числами).
// Найти минимальное, максимальное и среднее из этого списка.
public class task_2 {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(10);
    Random random = new Random();
    for(int i =0 ; i < 10; i++){
        list.add(random.nextInt(1,10));
        
    }
    System.out.println(list);
    System.out.println("Max number = " + Collections.max( list));
    System.out.println("Min number = " + Collections.min(list));

    Collections.sort(list);
    System.out.println("Average number = " + list.get((list.size()/2)-1));

    int min = list.get(0);
    int max = list.get(0);
    double sum = 0;



    // Второй вариант решения 
    for (int i = 0; i < list.size(); i++) {
        sum += list.get(i);
        if(list.get(i)<min){
            min = list.get(i);
        }
        else if(list.get(i)>max){
            max=list.get(i);
        }
        }
    System.err.println(max);    
    System.err.println(min);
    System.err.println(sum/list.size()); // среднее число в листе 
    }

}
//Еще варинат решени 




