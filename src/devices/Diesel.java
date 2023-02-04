package devices;

public class Diesel extends Car
{

    public Diesel(String producent, String model, Double przebieg, Double value, Integer rok) {
        super(producent, model, przebieg, value, rok);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Zatankuj");
        System.out.println("Zapłać");
        System.out.println("Odjedź w płaczu");
    }


}
