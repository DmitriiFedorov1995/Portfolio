package animals;

import model.Size;

public class Giraffe extends Herbivore implements Voice, Run{
    @Override
    public String getVoice() {
        return "Moo";
    }

    @Override
    public void run() {
        System.out.println("скачу");
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }

    public Giraffe(String name) {
        super(name);
    }
}
