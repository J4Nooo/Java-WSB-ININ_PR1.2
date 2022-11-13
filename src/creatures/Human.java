package creatures;

public class Human extends Animal {
    String firstName;
    String lastName;
    private Double salary;
    private String car;
    Animal pet;

    public Human() {
        super("homo sapiens");
        salary = 0.0;
        System.out.println("Witaj");
    }

    public void getCar (){
        System.out.println(this.car);
    }
/*
    public void setCar(Car vehicle){
        if(salary > vehicle.value){
            System.out.println("Gratulacje! Udało ci się zakupić samochód za gotówkę");

        }
        else if(salary > (vehicle.value/12)){
            System.out.println("Gratulacje! Właśnie wkopałeś się w kredyt na samochód. Miłej jazdy");

        }
        else{
            System.out.println("Ślepa uliczka, koniec gry - znajdź nową pracę albo idz po podwyżkę, chyba że nadal chcesz jeździć drepcedesem");

        }
    }*/
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
         System.out.println("Dane o twojej wypłacie pobierane były 09:23 19.04.2041");
         return this.salary;
     }
    /*
    public void beEaten(){
         System.out.println("Chyba cie poebao");
     }*/
    //Jedna albo druga opcja jest wlasciwa ale druga poprawniejsza
    /*
    public void beEaten() throws Exception{
        throw new Exception("Nie ma opcji");
    }*/

}

