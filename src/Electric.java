public class Electric extends Car
{

    public Electric(String producent, String model) {
        super(producent, model);
    }

    @Override
    public void refuel() {
        System.out.println("Podjedź do garażu");
        System.out.println("Podłącz auto do ładowania");
        System.out.println("Płaczesz patrząc na rachunek za prąd");
        System.out.println("Możesz ruszać w przygodę");
    }


}
