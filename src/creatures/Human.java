package creatures;

import devices.Car;
import java.util.ArrayList;

public class Human extends Animal {

    public final static Integer DEFAULT_GARAGE_SIZE = 3;
    public final static Double DEFAULT_SALARY = 0.0;
    public static final String HUMAN_SPECIES = "homo sapiens";

    String firstName;
    String lastName;
    private Double salary;
    private Car car;
    Animal pet;


    private Car[] garage;
    public Human() {
        super(HUMAN_SPECIES);
        salary = DEFAULT_SALARY;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super(HUMAN_SPECIES);
        salary = DEFAULT_SALARY;
        this.garage = new Car[garageSize];
    }

    public Car getCar (Integer parkingSpot){
        return this.garage[parkingSpot];
    }

    public void setCar(Car car, Integer parkingSpot){
        if(this.garage[parkingSpot] == null) {
            this.garage[parkingSpot] = car;
        }
        else {
            System.out.println("Miejsce parkingowe zajęte");
        }
    }

    public Double getValueOfAllCars(){
        Double sum = 0.0;
        for(Car car : this.garage){
            if(car != null){
                sum += car.Value;
            }
        }
        return sum;
    }

 public void setSalary(Double salary) {
     if (salary >= 0) {
         this.salary = salary;
         System.out.println("Nowe dane zostały wysłane do systemu księgowego");
         System.out.println("Istnieje konieczność odebrania aneksu do umowy od pani Hani z kadr");
         System.out.println("ZUS i US już wiedzą o zmianie wypłaty także nie ma sensu ukrywać dochodu");
     } else {
         System.out.println("Ślepa uliczka, koniec gry - nie można przypisać ujemnej wartości wypłaty");
     }
 }
     public Double getSalary(){
         return salary;
     }

//    public void beEaten(){
//         System.out.println("Chyba cie poebao");
//
//    Jedna albo druga opcja jest wlasciwa ale druga poprawniejsza

    public void beEaten() throws Exception{
        throw new Exception("Nie ma opcji");
    }

    public String toString(){
        return "No elo, jestem " + this.name;
    }
}

