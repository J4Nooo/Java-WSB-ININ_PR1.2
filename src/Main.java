public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Burek";
        dog.isAlive = true;

        System.out.println(dog.name);
        dog.feed();
        dog.takeForAWalk();

        Human me = new Human();
        me.firstName = "Jan";
        me.pet = dog;
        me.salary = 4500.0;
        System.out.println(me.pet.name);
        System.out.println(me.pet.weight);


        Car esa = new Car("Audi","S3");
        esa.Przebieg = 65000.0;
        esa.Wlasnosc = me.toString();

        System.out.println(esa.Producent);
        System.out.println(esa.Model);
        System.out.println(esa);


    }
}