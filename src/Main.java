import creatures.Animal;
import creatures.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Burek";

        Human jan = new Human();
        jan.name = "jan";

        System.out.println(dog);
        System.out.println(jan);



//        Komentowanie kilku wierszy: zaznaczyc i ctrl+/
//        W druga strone to samo


//        dog.isAlive = true;
//
//        System.out.println(dog.name);
//        dog.feed();
//        dog.takeForAWalk();
//
//        Human me = new Human();


//        Phone iphone = new Phone("Samsung","Z3");



        Car esa = new Car("Audi", "S3", 65000.0, 120000.0) {
            @Override
            public void refuel() {

            }
        };
        esa.Wlasnosc = jan.toString();

        Diesel passat = new Diesel("vw", "passat");
        passat.refuel();


//        System.out.println(esa.Producent);
//        System.out.println(esa.Model);
//        System.out.println(esa);
//
//        iphone.recharge(100);

        Phone nokia = new Phone("Nokia","3310");

        List<String> appNames = new ArrayList<>();
        appNames.add("FB");
        appNames.add("Messenger");
        appNames.add("WhatsApp");

        nokia.installAnApp(appNames);
        nokia.installAnApp("snake");
        nokia.installAnApp("Tweeter", "5.10");
        nokia.installAnApp("Spotify", "3.00", "https://spotify.com");


    }
}