package test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class test {
public static void main(String[] args) {
//     System.out.println("Введите положительное число: ");
//     Scanner in = new Scanner(System.in);
//     int input = in.nextInt();
//     boolean b = true;
//     for (int P = 2; P <= input; P++) {
//         for (int i = 2; i < P; i++) {
//             if (P % i == 0) {
//                 b = false;
//                 break;
//             }
//         }
//         if (b) System.out.println(P);
//         else b = true; 
for (int j = 1; j < a; j++) {
      k = 0;
      for (int i = 1; i < j+1; i++) {
          if (j % i == 0) {
              k++;
          }

      }
      if (k == 2) {
          System.out.println(j + " ");
      }
  }  
} 
   
