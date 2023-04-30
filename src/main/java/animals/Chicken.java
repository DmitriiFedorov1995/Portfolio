package animals;

import model.Size;

public class Chicken extends Herbivore implements Run, Voice{
    @Override
    public String getVoice() {
        return "Ko-ko-ko!";
    }

    @Override
    public void run() {
        System.out.println("прыгаю");
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }

    public Chicken(String name) {
        super(name);
    }
}
