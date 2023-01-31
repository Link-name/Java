/* Задание 1.
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Входная строка:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Выходная строка:
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
;*/
package Work_Lesson_2;
public class task_1 {
    public static void main(String[] args) {
        String strDir = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder string = new StringBuilder();
        String str = strDir.replace("{","").replace("}", "").replace("/", "strDir");
        String[] arr = str.split(",");
       
        for (int j = 0; j < arr.length; j++) {
            if (!(arr[j].contains("null"))){
                String[] arr3 =arr[j].split(":");
                    string.append(arr3[0].replace("\"",""));
                    string.append(" = " + arr3[1] + " and ");
            }
        }
        string.setLength(string.length()-4);
        System.out.println("select * from students where"+ string);
    }
}   
