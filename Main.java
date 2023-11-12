import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Car c1= new Car();
        Bike b =new Bike();
        Truck t =new Truck();
        ArrayList<Vehicle> rentedVehicles = new ArrayList<Vehicle>();
        System.out.println(rentedVehicles.size());

        while (true){
            System.out.println("1. Rent a Car ");
            System.out.println("2. Rent a Bike ");
            System.out.println("3. Rent a Truck ");
            System.out.println("4. View Rented Vehicles ");
            System.out.println("5. Exit ");
            System.out.println("please enter number process");
            int num =s.nextInt();
            switch (num){
                case 1:
                    System.out.println("please enter model car and total days");
                    Car c2 =new Car(s.next(),s.nextInt());
                    rentedVehicles.add(c2);
                    break;
                case 2:
                    System.out.println("please enter model Bike and total hours");

                    Bike b2 =new Bike(s.next(),s.nextInt());
                    rentedVehicles.add(b2);
                    break;
                case 3:
                    System.out.println("please enter type of truck and total weeks");

                    Truck t1 =new Truck(s.next(),s.nextInt());
                    rentedVehicles.add(t1);

                    break;
                case 4:
                    for (Vehicle f:rentedVehicles) {
                        f.displayDetails();

                    }
                    break;
                case 5:
                    System.exit(-1);
                    break;

            }

        }



    }
}