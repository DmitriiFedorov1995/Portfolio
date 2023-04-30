import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Aviary;
import model.Size;

public class Zoo {
    public static Aviary<Carnivorous> carnivorousAviary = new Aviary<Carnivorous>(Size.LARGE);
    public  static Aviary<Herbivore> herbivoreAviary = new Aviary<Herbivore>(Size.MEDIUM);

    public static void main(String[] args) {
    // объекты животных
        Bear bear = new Bear("Misha");
        Chicken chicken = new Chicken("Kok");
        Duck duck = new Duck("Gus");
        Fish fish = new Fish("Fish");
        Giraffe giraffe = new Giraffe("Gosha");
        Kotik kotik = new Kotik("Barsik");


        //еда
        Grass grass = new Grass();
        Meat meat = new Meat();


    //работник
        Worker worker = new Worker();
        //работа в клетке с медведем
        try {
            worker.feed(bear, meat);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            worker.feed(bear, grass);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        worker.getVoice(bear);

        //работа в курятнике
        try {
            worker.feed(chicken, meat);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            worker.feed(chicken, grass);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        worker.getVoice(chicken);

        //работа в утятнике
        try {
            worker.feed(duck, meat);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            worker.feed(duck, grass);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        worker.getVoice(duck);

        //работа на пруду
        try {
            worker.feed(fish, meat);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            worker.feed(fish, grass);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

        //работа в клетке с жирафом
        try {
            worker.feed(giraffe, meat);
        } catch (WrongFoodException e) {
            throw new RuntimeException(e);
        }
        try {
            worker.feed(giraffe, grass);
        } catch (WrongFoodException e) {
            throw new RuntimeException(e);
        }
        worker.getVoice(giraffe);

        //играю с котиком
        try {
            worker.feed(kotik, meat);
        } catch (WrongFoodException e) {
            throw new RuntimeException(e);
        }
        try {
            worker.feed(kotik, grass);
        } catch (WrongFoodException e) {
            throw new RuntimeException(e);
        }
        worker.getVoice(kotik);


        for (Swim o:createPond()){
            o.swim();
        }


    }

    public static Swim[] createPond(){
        Swim[] swimmers = new Swim[3];
        swimmers[0] = new Fish("Tune");
        swimmers[1] = new Duck("Duck");
        swimmers[2] = new Fish("Salmon");
        return swimmers;
    }

    public static void fillCarnivorousAviary(){
        carnivorousAviary.addAnimal(new Bear("misha"));
        carnivorousAviary.addAnimal(new Fish("bob"));
        carnivorousAviary.addAnimal(new Kotik("pups"));
    }

    public static void fillHerbivoreAviary(){
        herbivoreAviary.addAnimal(new Giraffe("goga"));
        herbivoreAviary.addAnimal(new Duck("utya"));
        herbivoreAviary.addAnimal(new Chicken("kok"));
    }

    public static Carnivorous carnivorousAviary(String name){
        return carnivorousAviary.getAnimal(name);
    }

    public static Herbivore getHerbivore(String name){
        return herbivoreAviary.getAnimal(name);
    }

}
