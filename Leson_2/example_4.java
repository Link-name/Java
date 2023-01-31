package Leson_2;
// вывести дилнную строку текс
public class example_4 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sd = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sd.append("Test");
    
        } 
    System.out.println(sd);    
    System.out.println(System.currentTimeMillis() - s);
    
    }
   
}
