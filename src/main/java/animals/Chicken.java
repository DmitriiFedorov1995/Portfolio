package animals;

public class Chicken extends Herbivore implements Run, Voice{
    @Override
    public String getVoice() {
        return "Ko-ko-ko!";
    }

    @Override
    public void run() {
        System.out.println("прыгаю");
    }
}
