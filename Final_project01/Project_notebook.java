package Final_project01;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;


public class Project_notebook {
    public static void main(String[] args) {
        
    
    StringBuffer jsonStr = new StringBuffer();
    try(BufferedReader br = new BufferedReader(new FileReader("Final_project01/List.json"))){
        StringBuffer jsonStr = new StringBuffer();
        Integer line;
        while (line = br.readLine() != null ) {
            jsonStr.append(line);
            
        }
        
        System.out.println(jsonStr);
    } catch (IOException e) {
        e.printStackTrace();
    }
    

    }

} 

