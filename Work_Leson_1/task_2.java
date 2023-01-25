// Вывести все простые числа от 1 до 1000
package Work_Leson_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        System.out.println("Ведите число ");
        Scanner nScanner = new Scanner(System.in);   
        int number = nScanner.nextInt();
        for (int i = 1; i < number; i++) {
            int count = 0;
            for (int j = 1; j < i+1; j++) {
                if ((i % j)==0){
                    count++;
                }
            }    
            if (count == 2){
                System.out.println("Просто число : " + i);
            }    
            
        
       }

        

    }
    
}
