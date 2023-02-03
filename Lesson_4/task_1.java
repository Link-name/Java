package Lesson_4;


import java.util.LinkedList;


public class task_1 {

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            list.add(1);
        }
        
        // for (int i = 0; i < 1_000; i++) {
        //     sb.append("Test");   
        // }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis()-s);
    }
    
    
}
