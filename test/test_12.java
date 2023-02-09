package test;
import java.util.*;

public class test_12 {
    public static void main(String[] args) {
        Map<String, Integer> name = new HashMap<>();
        String strPeople =
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] list = strPeople.split(" ");
        for (int i = 0; i < list.length; i += 2) {
            if (name.containsKey(list[i])) {
    
                name.replace(list[i], name.get(list[i]) + 1);
            } else {
                name.put(list[i], 1);
            }
        }

        Map<String, Integer> sortedName = new LinkedHashMap<>();
        int max = 1;
        for (int value : name.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : name.entrySet()) {
                String key = entry.getKey();
                if (name.get(key) == i) {
                    sortedName.put(key, name.get(key));

                }
                
            }
        }
        System.out.print(sortedName);
    }
}
