package devices;

public class LPG extends Car
{

    public LPG(String producent, String model, Double przebieg, Double value) {
        super(producent, model, przebieg, value);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Podłącz pistoleg z devices.LPG do korka wstydu");
        System.out.println("Nie płacz, devices.LPG tańsze");
        System.out.println("Odłącz pistolet z korka wstydu");
        System.out.println("Odjedź ze stacji");
    }


}
