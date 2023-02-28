package Final_java_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        HashMap<Integer, Laptop> notebooks = new HashMap<Integer, Laptop>();
        notebooks.put(1, new Laptop(1, "Apple", "MacBook Pro", 16, 512, "macOS", 1999.99));
        notebooks.put(2, new Laptop(2, "Dell", "XPS 13", 8, 256, "Windows 10", 1099.99));
        notebooks.put(3, new Laptop(3, "Lenovo", "ThinkPad X1 Carbon", 16, 512, "Windows 10", 1399.99));
        notebooks.put(4, new Laptop(4, "HP", "Spectre x360", 16, 512, "Windows 10", 1399.99));
        notebooks.put(5, new Laptop(5, "Microsoft", "Surface Laptop 4", 8, 256, "Windows 10", 999.99));
        
        System.out.println("Welcome to the notebook catalog!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an action:");
            System.out.println("1 - Print all items");
            System.out.println("2 - Search the catalog");
            System.out.println("0 - Exit");
            
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                for (Laptop notebook : notebooks.values()) {
                    System.out.println(notebook);
                }
            } else if (choice.equals("2")) {
                System.out.println("Enter the number that matches the search criterion:");
                System.out.println("1 - RAM");
                System.out.println("2 - HD capacity");
                System.out.println("3 - Operating system");
                
                String criterionChoice = scanner.nextLine();
                if (criterionChoice.equals("1")) {
                    System.out.print("Enter RAM amount (in GB): ");
                    int ram = Integer.parseInt(scanner.nextLine());
                    ArrayList<Laptop> filteredNotebooks = new ArrayList<Laptop>();
                    for (Laptop notebook : notebooks.values()) {
                        if (notebook.ram == ram) {
                            filteredNotebooks.add(notebook);
                        }
                    }
                    System.out.println("Laptops with " + ram + "GB RAM:");
                    for (Laptop notebook : filteredNotebooks) {
                        System.out.println(notebook);
                    }
                } else if (criterionChoice.equals("2")) {
                    System.out.print("Enter HD capacity amount (in GB): ");
                    int hdCapacity = Integer.parseInt(scanner.nextLine());
                    ArrayList<Laptop> filteredNotebooks = new ArrayList<Laptop>();
                    for (Laptop notebook : notebooks.values()) {
                        if (notebook.hdCapacity == hdCapacity) {
                            filteredNotebooks.add(notebook);
                        }
                    }    
                    System.out.println("Laptops with " + hdCapacity + "GB HD capacity:");
                    for (Laptop notebook : filteredNotebooks) {
                        System.out.println(notebook);
                    } 
                }else if (criterionChoice.equals("3")) {
                        System.out.print("Enter operating system: ");
                        String operatingSystem = scanner.nextLine();
                        ArrayList<Laptop> filteredNotebooks = new ArrayList<Laptop>();
                        for (Laptop notebook : notebooks.values()) {
                        if (notebook.operatingSystem.equals(operatingSystem)) {
                        filteredNotebooks.add(notebook);
                        }
                        }
                        System.out.println("Laptops with " + operatingSystem + " operating system:");
                        for (Laptop notebook : filteredNotebooks) {
                        System.out.println(notebook);
                        }
                    }
            }else if (choice.equals("0")) {
                    System.out.println("Goodbye!");
                    break;
                        } else {
                        System.out.println("Invalid choice, please try again.");
                        }
        }
    }
}
                
                   
