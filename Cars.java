package CarProject;

public abstract class Cars {
    private String make;
    private String vinNumber;
    private String model;
    private double price;
    private int year;
    private double mileage;

    public Cars(String make, String vinNumber, String model, double price, int year, double mileage) {
        this.make = make;
        this.vinNumber = vinNumber;
        this.model = model;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter for 'make'
    public String getMake() {
        return make;
    }

    // Setter for 'make'
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for 'vinNumber'
    public String getVinNumber() {
        return vinNumber;
    }

    // Setter for 'vinNumber'
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    // Getter for 'model'
    public String getModel() {
        return model;
    }

    // Setter for 'model'
    public void setType(String model) {
        this.model = model;
    }

    // Getter for 'price'
    public double getPrice() {
        return price;
    }

    // Setter for 'price'
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be a non-negative number.");
        }
        this.price = price;
    }

    // Getter for 'year'
    public double getYear() {
        return year;
    }

    // Setter for 'year'
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive whole number.");
        }
        this.year = year;
    }

    // Getter for 'milage'
    public double getMileage() {
        return mileage;
    }

    // Setter for 'mileage'
    public void setMileage(double mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage must be a non-negative number.");
        }
        this.mileage = mileage;
    }

    public String toString(){
        return "Make: " + make +
        "Model: " + model +
        "Price : " + price +
        "VIN: " + vinNumber +
        "Year: " + year + 
        "Mileage: " + mileage +
        "";
    }
}