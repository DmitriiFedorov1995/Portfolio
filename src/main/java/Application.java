import animals.Kotik;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

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

    @Nullable
    static boolean compareVoice(@NotNull Kotik firstCat,@NotNull Kotik secondCat){
            return firstCat.getVoice().equals(secondCat.getVoice());
    }
}
