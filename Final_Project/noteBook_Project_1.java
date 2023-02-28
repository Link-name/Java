package Final_Project;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class noteBook_Project_1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Final_Project/List.json");
            int character;
            StringBuilder jsonString = new StringBuilder();
            while ((character = reader.read()) != -1) {
                jsonString.append((char) character);
            }
            reader.close();

        String json = jsonString.toString();

        HashSet<notebook> laptops = new HashSet<notebook>();

        String[] entries = json.split("\\{\\s*}");
        for (String entry : entries) {
            if (entry.length() > 0) {
                String[] fields = entry.split(",\\s*");

                String manufacturer = "", model = "", operatingSystem = "", screen = "", processor = "", ram = "",
                        builtInGraphicsCard = "", discreteGraphicsCard = "", ssd = "", hdd = "";
                double price = 0, priceWithoutDiscounts = 0, discount = 0;

                for (String field : fields) {
                    String[] parts = field.split(":\\s*");
                    String key = parts[0].replaceAll("\"", "");
                    String value = parts[1].replaceAll("\"", "");

                    switch (key) {
                        case "Manufacturer":
                            manufacturer = value;
                            break;
                        case "Model":
                            model = value;
                            break;
                        case "Operating System":
                        case "Operating system":
                            operatingSystem = value;
                            break;
                        case "Display":
                        case "Screen":
                            screen = value;
                            break;
                        case "Processor":
                        case "CPU":
                            processor = value;
                            break;
                        case "RAM":
                            ram = value;
                            break;
                        case "Built-in Graphics Card":
                        case "Built-in graphics card":
                            builtInGraphicsCard = value;
                            break;
                        case "Discrete Graphics Card":
                        case "Discrete graphics card":
                            discreteGraphicsCard = value;
                            break;
                        case "SSD":
                            ssd = value;
                            break;
                        case "HDD":
                            hdd = value;
                            break;
                        case "Price":
                            price = Double.parseDouble(value);
                            break;
                        case "Price without discounts":
                            priceWithoutDiscounts = Double.parseDouble(value);
                            break;
                        case "Discount":
                            discount = Double.parseDouble(value);
                            break;
                    }
                }

                notebook laptop = new notebook(manufacturer, model, operatingSystem, screen, processor, ram,
                        builtInGraphicsCard, discreteGraphicsCard, ssd, hdd, price, priceWithoutDiscounts, discount);
                laptops.add(laptop);
                System.out.println(laptops.toString());
            }
        }

        List<notebook> laptopsList = new ArrayList<notebook>(laptops);

        for (int i = 0; i < laptopsList.size(); i++) {
            notebook laptop = laptopsList.get(i);
            System.out.println("Laptop " + (i + 1) + ":");
            System.out.println(laptop.toString());
        }
    } catch (IOException e) {
        System.out.println("An error occurred while reading the file.");
        e.printStackTrace();
    }
}
}