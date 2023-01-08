public abstract class Car extends Device
{

    Double Przebieg;
    String Wlasnosc;
    public Double value;

    public Car(String producent, String model) {
        super(producent, model);
        Producent = producent;
        Model = model;
    }

    public abstract void refuel();



    @Override
    void recharge(Integer percentage) {
        System.out.printf("Ładuję");
        System.out.println("Ładuję");
        System.out.println("Nałdowane");
    }

    @Override
    boolean isOn() {
        return false;
    }


//    public static void main(String Producent, String Model) {
//        System.out.println(new Car("Audi","S4")
//                 .equals(new Car("Audi","S4")));
//                 }


    public String toString() {
        return "Producent: " + this.Producent + " Model: " + this.Model;
    }
}

