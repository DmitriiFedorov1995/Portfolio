package animals;

public class Bear extends Carnivorous implements Run, Voice{
    @Override
    public void run() {
        System.out.println("Топаю");
    }

    @Override
    public String getVoice() {
        return "Ahrrr!";
    }
}
