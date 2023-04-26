package animals;

public class Kotik extends Carnivorous implements Voice, Run{
    @Override
    public String getVoice() {
        return "Meow";
    }

    @Override
    public void run() {
        System.out.println("бегаю быстро");
    }
}
