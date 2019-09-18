public class CarApp {
    public static void main(String[] args) {
        Car c = new Car("Porsche", "red", 2010, 110);
        Car b = new Car("Jetta", "blue", 2019, 105);
//        c.setCarColor("red");
//        c.setModelName("Porsche");
//        c.setAmtOfWheels(4);
//        System.out.println(c.startUp());
//        String hey = c.fullName();
//        System.out.println(hey);
        System.out.println(c.testRun());
        System.out.println(b.testRun());
        System.out.println(c.startUp() + "\n" + b.startUp());

        // for this last line to work, a Car Array class called Compete
        // could be done, with a private member variable made of a
        // Car Array, choosing one car randomly as a winner from the array
        System.out.println(b.fullName() + " just passed " + c.fullName());




    }
}
