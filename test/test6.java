package test;
//Создать список целых чисел (заполнить случайными числами),
// удалить из списка четные числа.
import java.util.ArrayList;
import java.util.Random;

public class test6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Random random = new Random();
        for(int i = 0; i<20; i++){
            list.add(random.nextInt(1,20));
        }
        System.out.println("Рандомный лист = " + list);
       
        for(int i = 0; i<list.size(); i ++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;   
            }
            
        }System.out.println("Лист нечетных чисел = "+ list);    
    }   
    
}



// // notify container that thread is exiting
// ThreadContainer container = threadContainer();
// if (container != null) {
//     container.onExit(this);
// }

// try {
//     if (threadLocals != null && TerminatingThreadLocal.REGISTRY.isPresent()) {
//         TerminatingThreadLocal.threadTerminated();
//     }
// } finally {
//     clearReferences();
// }
// }
