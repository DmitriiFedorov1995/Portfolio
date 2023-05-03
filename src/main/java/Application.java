import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik fatKot = new Kotik("Gosha", "Low", 3, 10);
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
        System.out.println(Kotik.getCount());
    }

    static boolean compareVoice(Kotik firstCat, Kotik secondCat){
       if (firstCat == null || secondCat == null){
            return false;
       }else return firstCat.getVoice().equals(secondCat.getVoice());
    }
}
