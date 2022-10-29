public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 5.0;
    private static final Double DEFAULT_MOUSE_WEIGHT = 0.2;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0 ;


    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    Animal(String specie) {
        this.specie = specie;
        this.isAlive = true;

        switch(specie){
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            default: this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed(){
        if (this.isAlive = true){
        this.weight += 0.5;
        System.out.println("dzięki za żarcie");}
        else {
            System.out.println("Czy wszystko dobrze z głową?");
        }
    }
    void takeForAWalk(){
        if (this.isAlive = true){
            this.weight -= 1;
            System.out.println("Dziękuję bardzo za spacer");
        }
        else{
            System.out.println("I'm calling 991");
        }
        if (this.weight <= 0){
            System.out.println("Twoje zwierzę umarło");


        }

    }

}
