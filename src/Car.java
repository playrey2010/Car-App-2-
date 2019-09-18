public class Car extends Vehicle{
    private String modelName;
    private String carColor;
    private int year;
    private int mph;

    public Car() {
        super();
    }

    public Car(String modelName, String carColor, int year, int mph) {
        this.modelName = modelName;
        this.carColor = carColor;
        this.year = year;
        this.mph = mph;
    }
    //METHODS
    // this first methods combines all other String methods
    public String testRun() {
        return startUp() + "\n" + accelerate() + "\n" + howFast() +
                "\n" + stop();
    }

    public String fullName() {
        return "The " + carColor + " " + modelName;
    }

    public String startUp() {
        return fullName() + " is starting...";
    }

    public String accelerate() {
        return fullName() + " is accelerating.";
    }

    public String howFast() {
        return fullName() + " is going at " + mph + "mph.";
    }

    public String stop() {
        return fullName() + " is stopped.";
    }
    // getters and setters

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }
}
