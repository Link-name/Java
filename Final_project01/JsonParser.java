package Final_project01;


    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public static void main(String[] args) {
        try {
            List<String> jsonArray = readJsonArrayFromFile("Final_project01/List.json");
            List<JsonObject> jsonObjects = new ;
            for (JsonObject jsonObject : jsonObjects) {
                System.out.println(jsonObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // public static List<JsonObject> parseJsonArray(List<String> jsonArray) {
    //     List<JsonObject> jsonObjects = new ArrayList<>();
    //     for (String jsonString : jsonArray) {
    //         JsonObject jsonObject = parseJsonObject(jsonString);
    //         jsonObjects.add(jsonObject);
    //         System.out.println(jsonObjects);
    //     }
    //     return jsonObjects;
    // }

    // public static JsonObject parseJsonObject(String jsonString) {
    //     // Реализация парсера JSON-объекта
    //     return null;
    // }

    public static List<String> readJsonArrayFromFile(String filename) throws IOException {
        List<String> jsonArray = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            StringBuilder jsonStrBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonStrBuilder.append(line.trim());
            }
            String jsonStr = jsonStrBuilder.toString();
            // Извлечение JSON-массива из строки
            int startIndex = jsonStr.indexOf("[");
            int endIndex = jsonStr.lastIndexOf("]");
            String jsonArrayStr = jsonStr.substring(startIndex, endIndex + 1);
            // Разбиение JSON-массива на элементы
            String[] jsonArrayElements = jsonArrayStr.split("(?<!\\\\),");
            for (String jsonArrayElement : jsonArrayElements) {
                jsonArrayElement = jsonArrayElement.trim();
                // Удаление начальной и конечной кавычек (если есть)
                if (jsonArrayElement.startsWith("\"") && jsonArrayElement.endsWith("\"")) {
                    jsonArrayElement = jsonArrayElement.substring(1, jsonArrayElement.length() - 1);
                }
                jsonArray.add(jsonArrayElement);
                // System.out.println(jsonArrayElement + "\n");
            }
            // System.out.println(jsonArray+ "\n");
        }
        return jsonArray;
    }

    public static class JsonObject {
        // Класс для представления JSON-объекта
        // Можно добавить поля для хранения значений свойств
        @Override
        public String toString() {
            return "JsonObject{}";
        }
    }
}
    
