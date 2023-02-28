package Final_Project;


public class notebook {
    String manufacturer;
    String model;
    String operatingSystem;
    String screen;
    String processor;
    String ram;
    String builtInGraphicsCard;
    String discreteGraphicsCard;
    String ssd;
    String hdd;
    double price;
    double priceWithoutDiscounts;
    double discount;

    public notebook(String manufacturer, String model, String operatingSystem, String screen, String processor, String ram, String builtInGraphicsCard, String discreteGraphicsCard, String ssd, String hdd, double price, double priceWithoutDiscounts, double discount) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.builtInGraphicsCard = builtInGraphicsCard;
        this.discreteGraphicsCard = discreteGraphicsCard;
        this.ssd = ssd;
        this.hdd = hdd;
        this.price = price;
        this.priceWithoutDiscounts = priceWithoutDiscounts;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + this.manufacturer + "\n"
            + "Model: " + this.model + "\n"
            + "Operating System: " + this.operatingSystem + "\n"
            + "Screen: " + this.screen + "\n"
            + "Processor: " + this.processor + "\n"
            + "RAM: " + this.ram + "\n"
            + "Built-in Graphics Card: " + this.builtInGraphicsCard + "\n"
            + "Discrete Graphics Card: " + this.discreteGraphicsCard + "\n"
            + "SSD: " + this.ssd + "\n"
            + "HDD: " + this.hdd + "\n"
            + "Price: " + this.price + "\n"
            + "Price without discounts: " + this.priceWithoutDiscounts + "\n"
            + "Discount: " + this.discount + "\n";
}
}
    