package devices;

public abstract class Car extends Device implements Comparable<Car>
{

    Double Przebieg;
    String Wlasnosc;
    Integer Rok;


    public Car(String producent, String model, Double przebieg, Double value, Integer rok) {
        super(producent, model, value);
        Producent = producent;
        Model = model;
        Przebieg = przebieg;
        Value = value;
        Rok = rok;

    }

    public abstract void refuel();



    @Override
    public void recharge(Integer percentage) {
        System.out.print("Ładuję");
        System.out.println("Ładuję");
        System.out.println("Nałdowane");
    }

    @Override
    public boolean isOn() {
        return false;
    }


//    public static void main(String Producent, String Model) {
//        System.out.println(new devices.Car("Audi","S4")
//                 .equals(new devices.Car("Audi","S4")));
//                 }


    public String toString() {
        return "Producent: " + this.Producent + " Model: " + this.Model + " Przebieg: " + this.Przebieg + " Wartość: " + this.Value + " Rok Produkcji: " + this.Rok;
    }
    @Override
    public int compareTo(Car otherCar) {
        return this.Rok.compareTo(otherCar.Rok);
    }
}

