package test;

import java.util.Arrays;

public class test4 {
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
        
    }  

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        int[] arrrrrr = AddItem(arr, 8);
        System.out.println(Arrays.toString(arrrrrr));    
    }
    
}


// public static void main(String[] args) {
//     int [] arr = {1,2,3,4,4};
//     System.out.println(AddItem(arr, 9));
// }

// public static void main(String args[]) {
//     System.out.print(maxFinder(3,8));
// }

// public void main(String args[]) {
//     SampleClass sc= new SampleClass();
//     System.out.print(sc.maxFinder(5,8));
// }