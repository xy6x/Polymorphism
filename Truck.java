public class Truck implements Vehicle{
    private int week;
    private String type;

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Truck() {
    }

    public Truck(String type,int week) {
        this.week = week;
        this.type = type;
    }

    public double calculateRentalCost() {
        return getWeek()*500;
    }

    @Override
    public void displayDetails() {

        System.out.println("the Type is : "+getType()+" The total Rentals: "+calculateRentalCost()+" Daily Rental Rate: $500.0");

    }
}
