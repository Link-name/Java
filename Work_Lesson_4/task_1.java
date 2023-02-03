package Work_Lesson_4;

import java.util.LinkedList;
import java.util.Random;

// Создать LinkedList целых чисел (заполнить случайными числами).
// Реализуйте метод, который вернет “перевернутый” список.
public class task_1 {
    public static void main(String[] args) {
        LinkedList <Integer> LL = new LinkedList<>();
        Random random = new Random();
        for (int i=0; i < 10 ; i++) {
            LL.add(random.nextInt(1,10)); 
            
        }
        System.out.println(LL);
         LL = MyRevers(LL);
        System.out.println("Верну"+ LL);
    }
    static LinkedList <Integer> MyRevers(LinkedList <Integer> arr){
        LinkedList <Integer> LL2 = new LinkedList<>();
        for (int i=arr.size(); i > 0 ; i--) {
                LL2.add(arr.get(i-1));    
            }
            return LL2; 
        }

   
}       
