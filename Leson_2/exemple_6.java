package Leson_2;

public class exemple_6 {
    public static void main(String[] args) {
        String strDir = "{\"name\": \"site_3\",\"version\": \1.0.0\",\"descririon\": \"text\",\" main\": \"index.js\"}";
        String str = strDir.replace("{", "").replace("}", "").replace("/", ""); 
        StringBuffer string = new StringBuffer();
        String [] arr = str.split(",");
        for(String string2 : arr){
            String[] string3 = string2.split(":");
            // System.out.printf("%s = %s", string3[0],string3[1]);
            string.append(string3[1]);  
        }
   
        System.out.printType(string);
    
   
    }   
    
}
