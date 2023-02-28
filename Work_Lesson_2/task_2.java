/*Дана json строка (можно сохранить в файл и читать из файла)
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Входная строка:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Выходная строка:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
package Work_Lesson_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task_2 {
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader("Work_Lesson_2/fail.json"))) {
                String data;
                System.out.println(br);
                while ((data = br.readLine()) != null) {
                    sb.append(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            // создание словаря
            Map<String, String> map = new HashMap<>();
    
            //Парсим строку, убираем лишние символы и записываем данные в словарь
            String[] keys = sb.toString().replace("{", "").
                    replace("[", "").
                    replace("]", "").
                    replace("\"", "").
                    replaceAll("\\s", "").
                    split("},");
                System.out.println(keys);
            for (String data : keys) {
                String[] person = data.split(",");
                for (String keyValues : person) {
                    String[] keyValue = keyValues.replace("}", "").split(":");
                    String key = keyValue[0];
                    String value = keyValue[1];
                    map.put(key, value);
                }
                System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
                        map.get("Модель"), map.get("предмет"));
            }
        }
    }
    
