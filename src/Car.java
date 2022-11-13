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
    public String toString(){
        return "Producent: " + this.Producent + " Model: " + this.Model;
}
}
