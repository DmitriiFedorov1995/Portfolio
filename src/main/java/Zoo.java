import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
    // объекты животных
        Bear bear = new Bear();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Giraffe giraffe = new Giraffe();
        Kotik kotik = new Kotik();


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



        /*Kotik fatKot = new Kotik("Gosha", "Low", 3, 10);

        Kotik kotik = new Kotik();
        kotik.setName("Murzik");
        kotik.setSatiety(3);
        kotik.setWeight(5);
        kotik.setVoice("Low");

        for (String s: kotik.liveAnotherDay()){
            System.out.println(s);
        }

        System.out.println(fatKot.getName()+" "+fatKot.getWeight());

        System.out.println(compareVoice(fatKot, kotik));

        System.out.println(Kotik.getCount());*/
    }

    public static Animal[] createPond(){
        Animal[] swimmers = new Animal[2];

        return swimmers;
    }
   /* static boolean compareVoice(Kotik firstCat, Kotik secondCat){
        return firstCat.getVoice().equals(secondCat.getVoice());
    }*/
}
