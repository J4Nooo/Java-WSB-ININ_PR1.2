public abstract class Car extends Device
{

    Double Przebieg;
    String Wlasnosc;
    public Double Value;

    public Car(String producent, String model, Double przebieg, Double value) {
        super(producent, model);
        Producent = producent;
        Model = model;
        Przebieg = przebieg;
        Value = value;

    }

    public abstract void refuel();



    @Override
    void recharge(Integer percentage) {
        System.out.print("Ładuję");
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

