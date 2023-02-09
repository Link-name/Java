package test;


import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.Map;


public class test_11 {
    public static void main(String[] args) {  
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Иванов " +
        "Кристина Белова"+
        "Анна Мусина"+
        "Анна Крутова"+
        "Иван Юрин"+
        "Петр Лыков"+
        "Павел Чернов"+
        "Петр Чернышов"+
        "Мария Федорова"+
        "Марина Светлова"+
        "Иван Савин"+
        "Мария Рыкова"+
        "Марина Лугова"+
        "Анна Владимирова"+
        "Петр Петин"+
        "Иван Ежов";
        String[] listOfNamesAndSurnames = employees.split(" ");
        for (int i = 0; i < listOfNamesAndSurnames.length; i += 2) {
            if (nameMap.containsKey(listOfNamesAndSurnames[i])) {
                nameMap.replace(listOfNamesAndSurnames[i], nameMap.get(listOfNamesAndSurnames[i]) + 1);
            } else {
                nameMap.put(listOfNamesAndSurnames[i], 1);
            }
        }
        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max+=1
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }      
       
}
