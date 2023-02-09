package Lesson_5;

import java.util.HashMap;

// Создать структура для хранения номеров паспортов и Фамилий 
// сотрудников организации.
// 12345 Иванов
// 321456 Васильев 
// 234561 Петрова 
//234432 Иванов
//654321 Петров
//345678 Иванов 
public class task_6 {
    public static void main(String[] args) {
        HashMap <Integer,String> userData = new HashMap<>();
        userData.put(123455, "Иванов");
        userData.put(321456, "Васильев");
        userData.put(234561, "Петрова");
        userData.put(654321, "Петров");
        userData.put(123457, "Иванов");
        userData.put(655673, "Петров");
        System.out.println(userData);
        for(int user : userData.keySet()){
            if ( userData.get(user) == "Иванов"){
                System.out.printf("Иванов паспорт: %s\n ",user);
            }
        }
            
        }


        
    }
    

