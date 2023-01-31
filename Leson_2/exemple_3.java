package Leson_2;

import java.io.File;

public class exemple_3 {
    public static void main(String[] args) {


        try {
            String pathProject = System.getProperty("user.dir"); // создаем путь 
            String pathFile = pathProject.concat("/file.txt");// указываем фаил 
            File f3 = new File(pathFile); // связать фаил с переменной
            System.out.println("try"); // если все ок и путь указан верно то истина
            } catch (Exception e) {
            System.out.println("catch");
            }
            finally
            { System.out.println("finally"); }
           

            try {
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/file.txt");
                File file = new File(pathFile);
                if (file.createNewFile()) {
                System.out.println("file.created"); // фаил был создан все ок, можно работать 
                }
                else {
                System.out.println("file.existed");// 
                }
                } catch (Exception e) {
                System.out.println("catch");
                } finally {
                System.out.println("finally");


    }
}
}
