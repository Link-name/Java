package test;

import java.util.HashMap;
import java.util.Map;

public class test_10 {
    public static void main(String[] args) {
        
    Map<String, Integer> occurrences = new HashMap<String, Integer>();
    String[] splitWords;
    for ( String word : splitWords ) {
        Integer oldCount = occurrences.get(word);
        if ( oldCount == null ) {
            oldCount = 0;
         }
   occurrences.put(word, oldCount + 1);
    }
}    
}    

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
"Иван Ежов"