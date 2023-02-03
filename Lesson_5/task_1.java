package Lesson_5;

public class task_1 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000; i++) {
            sb.append("Test");   
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis()-s);
    }

}
