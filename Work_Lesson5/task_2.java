package Work_Lesson5;
//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class task_2 {
public static void main(String[] args) {
    // String nameWorkers = "Кристина Белова"+
    // "Анна Мусина"+
    // "Анна Крутова"+    
    // "Иван Юрин"+
    // "Петр Лыков"+
    // "Павел Чернов"+
    // "Петр Чернышов"+
    // "Мария Федорова"+
    // "Марина Светлова"+
    // "Иван Савин"+
    // "Мария Рыкова"+
    // "Марина Лугова"+
    // "Анна Владимирова"+
    // "Иван Мечников"+
    // "Петр Петин"+
    // "Иван Ежов";
    // Map<String, Integer> occurrences = new HashMap<String, Integer>();

    Map<String, String> map = new HashMap<String, String>();
    map.put("Мусина","Анна");
    map.put("Крутова","Анна");
    map.put("Юрин","Иван");
    map.put("Лыков","Петр");
    map.put("Лыков","Петр");
    map.put("Лыков","Петр");
    map.put("Лыков","Петр");
    map.put("Лыков","Петр");
    map.put("Лыков","Петр");
    
    Set<Object> uniqueValues = new HashSet<Object>(map.values());
    for (int j = 0; j <  map.size(); j++) {
        
        if(map.get(key) )
        
    }

    int newValue =map.getOrDefault(i, 0) + 1;
    System.out.println(uniqueValues);
    }
    
}
