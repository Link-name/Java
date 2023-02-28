import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в систему котов!");
        System.out.println("Меню \n Нажмите 1. чтобы найти породы всех котов; Нажмите 2 для поиска");
        Scanner iScanner = new Scanner(System.in, "cp866" );
        int userInput = iScanner.nextInt();
        // Cat cat_1 = new Cat();
        // cat_1.name = "Barsik";
        // cat_1.name = "yellow";
        // cat_1.name = "siberian";
        // cat_1.name = "w";
        // cat_1.name = true;
        HashSet <Cat> catSet = new HashSet<Cat>();
        
        Cat cat_1 = new Cat("Игорь", 4,"green","siberian","m",false,122);
        Cat cat_2 = new Cat("Вита", 10,"brown","siberian","f",true,123);
        Cat cat_3 = new Cat("Филя", 10,"brown","siberian","m",true,144);
        

        catSet.add(cat_1);
        catSet.add(cat_2);
        catSet.add(cat_3);
        System.out.println(cat_3.faidCat(catSet,"f"));
        
        
 
       
        // switch(userInput){
        //     case 1:
        //         for (Cat cat : catSet){
        //             System.out.println(cat.breed);
        //         }
        //         break;
        //     case 2:
        //     System.out.println("Введите половой признак кота (f/m)"); 
        //     String genderInput = iScanner.next();
        //     List <Cat> queryCat = cat_3.faidCat(catSet, genderInput);
        //     for (Cat pupa : queryCat) {
        //         System.out.println(pupa.printCat());
        //     }  
        // }        


 
    }

 

    

    
}
