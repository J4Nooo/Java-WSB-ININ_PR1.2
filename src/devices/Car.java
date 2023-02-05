package devices;


import creatures.Human;

public abstract class Car extends Device implements Comparable<Car>, Saleable
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


    public String toString() {
        return "Producent: " + this.Producent + " Model: " + this.Model + " Przebieg: " + this.Przebieg + " Wartość: " + this.Value + " Rok Produkcji: " + this.Rok;
    }
    @Override
    public int compareTo(Car otherCar) {
        return this.Rok.compareTo(otherCar.Rok);
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasACar(this)){
            throw new Exception("Sprzedawca nie posiada samochodu");
        }
        if(!buyer.canHaveMoreCars()){
            throw new Exception("Kupujący nie ma miejsca na nowy samochód");
        }
        if(buyer.hasLessMoneyThen(price)){
            throw new Exception("Kupujący nie posiada wystarczającej ilości pieniędzy");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.addMoney(price);
        buyer.collectMoney(price);
        System.out.println("Transakcja się powiodła");

    }
}

