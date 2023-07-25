package CarProject;

/* public class Main extends Application {
    public void start(Stage primaryStage){
        SUV suv1 = new SUV("Honda", "HBO123", "Odyssey", 8000.50, 2012, 120560.90, true, "Large", "Stereos");
        Truck truck1 = new Truck("Toyota", "TRO456", "4Runner", 45000.99, 2020, 88000.32, false, "Mid-size", "Uni-body", true);
        Sedan sed1 = new Sedan("Hyundai", "HUN890", "Sonata", 23000.75, 2023, 26000, false, false, 4, false, "Medium");
        Hatchback hatch1 = new Hatchback("Ford", "FOR567", "Focus", 48000.89, 2018, 95000.59, false, false, 4, false, "Mid-size");
    }
}
 */
public class Main {
    public static void main(String[]args){
        SUV suv1 = new SUV("Honda", "HBO123", "Odyssey", 8000.50, 2012, 120560.90, true, "Large", "Stereos");
        Truck truck1 = new Truck("Toyota", "TRO456", "4Runner", 45000.99, 2020, 88000.32, false, "Mid-size", "Uni-body", true);
        Sedan sed1 = new Sedan("Hyundai", "HUN890", "Sonata", 23000.75, 2023, 26000, false, false, 4, false, "Medium");
        Hatchback hatch1 = new Hatchback("Ford", "FOR567", "Focus", 48000.89, 2018, 95000.59, false, false, 4, false, "Mid-size");

       System.out.println(hatch1.toString());
    }
}
