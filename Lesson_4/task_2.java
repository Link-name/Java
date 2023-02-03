package Lesson_4;

import java.util.Stack;

// Написать метод который на вход принимает массив элементов,
// помещает в стек и выводит на консоль.
// Написать метод который принимает массив элементов, помещает в очередь и выводит в консоль содержимое очереди.
public class task_2 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        // Stack <Integer> stack = new Stack <>();
        // for(int i : arr){
        //     stack.add(i);
        // }
        // System.out.println(stack);
        Stack<Integer> newSteck = Turn(arr);
        System.out.println(newSteck.pop());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newSteck.pop());    
          
        }
         
            
    }
    static Stack<Integer> Turn(int[] arrInput) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arrInput) {
            stack.add(i);    
        }
        System.out.println(stack);
        return stack;

    }



}
