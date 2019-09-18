import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String again = "y";
        String choice = "";

        while (!again.equalsIgnoreCase("n")) {
            System.out.println("Do you want to add a car to your garage?" +
                    "\nType \"y\" to add a car. Type \"n\" to stop adding cars. ");
            again = sc.nextLine();
            if (again.equalsIgnoreCase("y")) {
                Car c = new Car();
                System.out.print("Enter the model name: ");
                c.setModelName(sc.nextLine());
                System.out.print("Enter the car's color: ");
                c.setCarColor(sc.nextLine());
                System.out.print("Enter the car's year: ");
                c.setYear(sc.nextInt());
                sc.nextLine();
                System.out.print("How fast in MPH is the " + c.getModelName() + " going?: ");
                c.setMph(sc.nextInt());
                sc.nextLine();

                cars.add(c);
            }
            else if (again.equalsIgnoreCase("n")) {
                break;
            }

        }
        for (Car car: cars) {
            System.out.println(car.fullName());
        }




//        Car c = new Car("Porsche", "red", 2010, 110);
//        Car b = new Car("Jetta", "blue", 2019, 105);

//        System.out.println(c.testRun());
//        System.out.println(b.testRun());
//        System.out.println(c.startUp() + "\n" + b.startUp());

        // for this last line to work, a Car Array class called Compete
        // could be done, with a private member variable made of a
        // Car Array, choosing one car randomly as a winner from the array
//        System.out.println(b.fullName() + " just passed " + c.fullName());



    }
}
