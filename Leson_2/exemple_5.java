package Leson_2;

public class exemple_5 {
    public static void main(String[] args) {
        String a = "aaaabbbcdd";
        StringBuilder b = new StringBuilder();
        int count = 1;
        for (int i = 0; i < a.length()-1; i++) {

            if (a.charAt(i) == a.charAt(i+1)){
                count++;
                }  
            else {
                b.append(a.charAt(i));
                b.append(count);
                count=1;
            }         
        }
        b.append(a.charAt(a.length()-1));
        b.append(count);
        System.out.println(b);
    }

    
}
