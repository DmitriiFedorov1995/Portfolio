package animals;

public class Giraffe extends Herbivore implements Voice, Run{
    @Override
    public String getVoice() {
        return "Moo";
    }

    @Override
    public void run() {
        System.out.println("скачу");
    }
}
