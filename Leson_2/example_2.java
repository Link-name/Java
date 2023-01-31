package Leson_2;

import java.io.File;
// Работа с файловой системой.
public class example_2 {
    public static void main(String[] args) {
        

    // Для работы нужно:
    // File <имя> = new File(<полный путь к файлу>);
    File f1 = new File("file.txt");
    File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
    // Что предпочтительнее?


    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/file.txt");
    File f3 = new File(pathFile);
    System.out.println(f3.getAbsolutePath());

    System.out.println(pathFile);
    File f1 = new File("file.txt");
    File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
    System.out.println(f1.getAbsolutePath());
    System.out.println(f2.getAbsolutePath());
}
}





