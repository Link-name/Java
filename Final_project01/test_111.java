package Final_project01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import Final_Project.noteBook_Project_1;

public class test_111 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader("Final_Project/List.json"))) {
        String data;
        while ((data = br.readLine()) != null) {
            sb.append(data);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    // создание словаря
    HashSet <notebook> notebookSet = new HashSet<notebook>();

    //Парсим строку, убираем лишние символы и записываем данные в словарь
    String[] keys = sb.toString().replace("{", "").
            replace("[", "").
            replace("]", "").
            replace("\"", "").
            replaceAll("\\s", " ").
            split("},");
            // notebook cat_1 = new notebook()

        // notebook cat_1 = new notebook();
    for (String data : keys) {
        System.out.println(data);
        String[] person = data.split(",");

        for (String keyValues : person) {
            String[] keyValue = keyValues.replace("}", "").split(":");
            String key = keyValue[0];
            // notebook cat_1 = new notebook(keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1],keyValue[1])
            String value = keyValue[1];
            System.out.println(value);
            
            // notebookSet.add(keyValue);
        }
        // System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
        //         map.get("Модель"), map.get("предмет"));
    }
}
}