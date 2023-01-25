package Work_Leson_1;

import java.util.Scanner;

public class task_3 {
    public static double sum(double a, double m){
       double sum = a + m;
        return sum;
    }
    public static double difference(double a, double m){
        double difference = a - m;
         return difference;
    }

    public static double to_share(double a, double m){
        double to_share = a / m;
         return to_share;
    } 
    
    public static double multiplication(double a, double m){
        double multiplication = a * m;
         return multiplication; 
    }
    public static void main(String[] args) {
        System.out.println("Введите число : ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        System.out.println("Введите число : ");
        double b = scanner.nextInt();
        System.out.println("Введите операцию : ");
        char operation = scanner.next().charAt(0);
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {// Так же можно сделать через Exception
            System.err.println("введите правильную опреацию + or - or * or /");}
        if (operation == '/' && b == 0 || a == 0) {
            System.err.println("На ноль делить нельзя."); // Так же можно сделать через Exception
            }    
        else if ( operation == '+' ){
            System.out.println(sum(a, b));
        }else if (operation == '-'){ 
            System.out.println(difference(a, b));   
        }else if (operation == '/'){
            System.out.println(to_share(a, b));
        }else if ( operation == '*' ){
            System.out.println(multiplication(a, b));
        }
         
    }        
}
