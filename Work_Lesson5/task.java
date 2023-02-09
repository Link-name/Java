package Work_Lesson5;

import java.util.HashMap;
import java.util.List;

public class task {
    public static HashMap<String, List<String>> BookT = new HashMap<>();

    public static void main(String[] args) {
        addInBookT();
        outputPersonNumber("Ромашкин");
    }

    public static void addInBookT() {
        BookT.put("Ильин", List.of("+7(111)111-11-11", "+7(923)222-22-22"));
        BookT.put("Дять", List.of("+7(333)333-33-33", "+7(567)444-44-44"));
        BookT.put("Сидоров",List.of("+7(555)234-55-55", "+7(666)666-66-66"));
        BookT.put("Кутузов",List.of("+7(555)555-435-55", "+7(976)666-66-66"));
        BookT.put("Кошкин",List.of("+7(533)555-55-55", "+7(666)666-11-66"));
        BookT.put("Ромашкин",List.of("+7(555)500-55-55", "+7(900)666-66-66"));

    }

    public static void outputPersonNumber(String surname) {
        System.out.printf("%s: %s", surname, BookT.get(surname).toString().replaceAll("^\\[|\\]$", ""));
    }
    
}
