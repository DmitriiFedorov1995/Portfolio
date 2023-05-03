import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Aviary;
import model.Size;
import model.WrongSizeException;

public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<Carnivorous>(Size.LARGE);
    private   static Aviary<Herbivore> herbivoreAviary = new Aviary<Herbivore>(Size.MEDIUM);

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
            worker.feed(bear, meat);
            worker.feed(bear, grass);
            worker.getVoice(bear);

        //работа в курятнике
            worker.feed(chicken, meat);
            worker.feed(chicken, grass);
            worker.getVoice(chicken);

        //работа в утятнике
            worker.feed(duck, meat);
            worker.feed(duck, grass);
            worker.getVoice(duck);

        //работа на пруду
            worker.feed(fish, meat);
            worker.feed(fish, grass);

        //работа в клетке с жирафом
            worker.feed(giraffe, meat);
            worker.feed(giraffe, grass);
            worker.getVoice(giraffe);

        //играю с котиком
            worker.feed(kotik, meat);
            worker.feed(kotik, grass);
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
            try {
                carnivorousAviary.addAnimal(new Bear("misha"));
            }catch (WrongSizeException e){

            }
            carnivorousAviary.addAnimal(new Fish("bob"));
            carnivorousAviary.addAnimal(new Kotik("pups"));
    }

    public static void fillHerbivoreAviary(){
        herbivoreAviary.addAnimal(new Giraffe("goga"));
        herbivoreAviary.addAnimal(new Duck("utya"));
        herbivoreAviary.addAnimal(new Chicken("kok"));
    }

    public static Animal carnivorousAviary(String name){
        return carnivorousAviary.getAnimal(name);
    }

    public static Herbivore getHerbivore(String name){
        return herbivoreAviary.getAnimal(name);
    }

    public static Carnivorous getCarnivorous(String name){
        return carnivorousAviary.getAnimal(name);
    }

}
