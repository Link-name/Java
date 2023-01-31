package test;

public class test3 {
    public static void main(String[] args) {
    String strDir = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"322\"}";
    StringBuilder string = new StringBuilder();
    String str = strDir.replace("{","").replace("}", "").replace("/", "strDir");
    String[] arr = str.split(",");
   
    for (int j = 0; j < arr.length; j++) {
        if (!(arr[j].contains("null"))){
            String[] arr3 =arr[j].split(":");
                string.append(arr3[0].replace("\"",""));
                string.append(" =  " + arr3[1] + " and ");
        }
    }
    string.setLength(string.length()-4);
    System.out.println("select * from students where"+ string);
   
    // for (int i = 0; i < arr.length;i++) {
    //     if(!(arr[i].contains("null"))){
    //         string.append(arr[i].replaceAll("/", "")+" and");
            
    //         System.out.println(arr[i]);
    //     }
    // }
    // string.setLength(string.length()-4);
    // System.out.println(string);
    // // StringBuilder string2 = string.replece(" ", " and ");
    // System.out.println("select * from students where "+ string);
    


}

    private static Object contains(String string) {
        return null;
    }
}
