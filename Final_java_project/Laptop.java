package Final_java_project;

public class Laptop {
    
        int identifier;
        String manufacturer;
        String modelName;
        int ram;
        int hdCapacity;
        String operatingSystem;
        double price;
    
        public Laptop(int identifier, String manufacturer, String modelName, int ram, int hdCapacity, String operatingSystem, double price) {
            this.identifier = identifier;
            this.manufacturer = manufacturer;
            this.modelName = modelName;
            this.ram = ram;
            this.hdCapacity = hdCapacity;
            this.operatingSystem = operatingSystem;
            this.price = price;
        }
    
        public String toString() {
            return manufacturer + " " + modelName + " (" + operatingSystem + "): " + ram + "GB RAM, " + hdCapacity + "GB HD, $" + price;
        }
    }

