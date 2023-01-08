import java.sql.SQLOutput;
import java.util.List;

public class Phone extends Device
{
    private static final String DEFAULT_VERSION = "Latest" ;
    private static final String DEFAULT_SERVER_ADDRESS = "https://Ajfonodjabłanadgryzionego.com";
    String Producent;
    String Model;
    public Phone(String producent, String model) {
        super(producent, model);
        Producent = producent;
        Model = model;
    }
    public void installAnApp(String appName){
        this.installAnApp(appName, DEFAULT_VERSION);
    }
    public void installAnApp(String appName, String version){
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }
    public void installAnApp(String appName, String version, String server){
        System.out.println("Próba instalacji aplikacji " + appName + " w wersji " + version);
        System.out.println("z serwera " + server);
        System.out.println("Sprawdzam miejsce w pamięci");
        System.out.println("Kontrola rodzicielska");
        System.out.println("Pobieranie aplikacji");
        System.out.println("Instalacja aplikacji");
    }
    public void installAnApp(List<String> appNames){
        for(String appName : appNames){
            this.installAnApp(appName);
        }
    }


    @Override
    void recharge(Integer percentage) {

    }

    @Override
    boolean isOn() {
        return false;
    }
}
