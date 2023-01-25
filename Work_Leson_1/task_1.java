package Work_Leson_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
    int summ = 0; 
        try{
            Scanner n = new Scanner(System.in);
            System.out.println("Введите n число");
            int number = n.nextInt();
            System.out.println("Введено число : " + number);
            for (int i = 0; i <= number; i++) {
                summ += i;
            }
        } catch(InputMismatchException ime){
            System.out.println("Ввод не коректный - введите число " +ime);
        }
            System.out.println("Сумма чисел введенного числа равна : "  + summ);
    }
        
}
