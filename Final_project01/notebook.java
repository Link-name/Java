package Final_project01;

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

    public notebook(String manufacturer, String model, String operatingSystem,
    String screen,
    String processor,
    String ram,
    String builtInGraphicsCard,
    String discreteGraphicsCard,
    String ssd,
    String hdd,
    double price,
    double priceWithoutDiscounts,
    double discount){
        this.manufacturer = manufacturer; 
        this.model = model; 
        this.operatingSystem = operatingSystem;
        this.screen = screen;
        this.processor = operatingSystem;
        this.ram = ram;
        this.builtInGraphicsCard = builtInGraphicsCard;
        this.discreteGraphicsCard = discreteGraphicsCard;
        this.ssd = ssd;
        this.hdd = hdd;
        this.price = price;
        this.priceWithoutDiscounts = priceWithoutDiscounts;
        this.discount = discount;



        
    }

    
    
}
