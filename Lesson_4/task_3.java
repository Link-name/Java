package Lesson_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task_3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Queue<Integer> newSteck = Turn(arr);
        System.out.println(newSteck);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newSteck.poll());    

        }
        System.out.println(newSteck); 
            
    }
    static Queue<Integer> Turn(int[] arrInput) {
        Queue<Integer> QueueInput = new LinkedList<>();
        for (int i : arrInput) {
            QueueInput.add(i);    
        }
        System.out.println(QueueInput);
        return QueueInput;
    }
    
}
