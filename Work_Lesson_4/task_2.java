package Work_Lesson_4;

import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.element.Element;




/*Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.*/
public class task_2 {




    public static void main(String[] args) {
        Queue <Integer> qList = new LinkedList<>();
        qList.add(6);
        qList.add(5);
        qList.add(2);
        qList.add(9);


        System.out.println(qList);
        System.out.println(AddElement(qList,10));// добавление
        // System.out.println(AddElement2(qList,5,5));
        System.out.println(DeletesFirstElement(qList));// удаление 
        System.out.println(FirsteLementQueue(qList));//  вывод без удаления



    

        // System.out.println(qList.remove())
        // System.out.println(qList);
        // System.out.println(qList.element());// вернет первый элемент в очереди не удаляя
        // System.out.println(qList.peek());// вернет первый элемент в очереди ( не выводя Exception)
        // Random random = new Random();
        // qList.add(random.nextInt(1, 10));
        // System.out.println(qList);


    }
    static Queue <Integer> AddElement2(Queue <Integer> arr, int number , int len ){
        for (int i = 0 ; i < len ; i ++) {
            arr.add(number++); 
        }
        return (Queue <Integer>) arr;
    }



    static Queue <Integer> AddElement(Queue <Integer> arr, int a ){
        arr.add(a);
        return (Queue <Integer>) arr;
            
    }

    static Queue <Integer> DeletesFirstElement(Queue <Integer> arr){
            arr.remove();
        return (Queue <Integer>) arr;
    }

    static Integer FirsteLementQueue(Queue <Integer> arr){
        arr.element();
        Integer firstElement = arr.element();
    return  firstElement;
}



}
