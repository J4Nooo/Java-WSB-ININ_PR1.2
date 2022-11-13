public class Car {

    final String Producent;
    final String Model;
    Double Przebieg;
    String Wlasnosc;
    Double value;

    public Car(String producent, String model) {
        Producent = producent;
        Model = model;
    }


     public static void main(String Producent, String Model) {
        System.out.println(new Car("Audi","S4")
                 .equals(new Car("Audi","S4")));
                 }


    public String toString() {
        return "Producent: " + this.Producent + " Model: " + this.Model;
    }
}

