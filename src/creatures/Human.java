package creatures;

import devices.Car;

import java.util.Arrays;


public class Human extends Animal{

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
        if(parkingSpot >= garage.length){
            System.out.println("Garaż jest za mały");
        }
        else if(parkingSpot < 0){
            System.out.println("Nie ma ujemnych miejsc parkingowych");
        }
        else if(this.garage[parkingSpot] != null){
            System.out.println("Miejsce parkingowe zajęte");
        }
        else{
            this.garage[parkingSpot] = car;
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

    public void sortCarsByYear(){
        Arrays.sort(this.garage);
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


    public void beEaten() throws Exception{
        throw new Exception("Nie ma opcji");
    }

    public String toString(){
        return "No elo, jestem " + this.name;
    }


    public boolean hasACar(Car car) {
        boolean hasACar = false;
        for (Car value : this.garage) {
            if (value == car) {
                hasACar = true;
                break;
            }
        }
        return hasACar;
    }

    public boolean canHaveMoreCars() {
        boolean canHaveMoreCars = true;
        for (Car value : this.garage) {
            if (value == car) {
                canHaveMoreCars = false;
                break;
            }
        }
        return canHaveMoreCars;
    }

    public boolean hasLessMoneyThen(Double price) {
        return salary >= car.Value;
    }

    public void removeCar(Car car) {

    }

    public void addMoney(Double price) {
        salary+=price;
    }

    public void collectMoney(Double price) {
        salary-=price;
    }

    public void addCar(Car car) {

    }
}

