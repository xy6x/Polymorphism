public class Bike implements Vehicle{
    private String brand;
    private int hour;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Bike() {
    }

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public double calculateRentalCost() {
        return getHour()*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("The brand is: "+getBrand()+" The total Rentals "+calculateRentalCost()+" Daily Rental Rate: $10.0");
    }
}
