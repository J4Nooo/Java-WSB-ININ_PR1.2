public class Diesel extends Car
{

    public Diesel(String producent, String model) {
        super(producent, model);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Zatankuj");
        System.out.println("Zapłać");
        System.out.println("Odjedź w płaczu");
    }


}
