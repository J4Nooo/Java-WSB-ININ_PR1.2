public class LPG extends Car
{

    public LPG(String producent, String model) {
        super(producent, model);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź na stację");
        System.out.println("Podłącz pistoleg z LPG do korka wstydu");
        System.out.println("Nie płacz, LPG tańsze");
        System.out.println("Odłącz pistolet z korka wstydu");
        System.out.println("Odjedź ze stacji");
    }


}
