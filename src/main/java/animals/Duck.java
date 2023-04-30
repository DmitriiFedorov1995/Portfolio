package animals;

import model.Size;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run{

    @Override
    public String getVoice() {
        return "Krya krya";
    }

    @Override
    public void fly() {
        System.out.println("шлепаю крыльями");
    }

    @Override
    public void swim() {
        System.out.println("Плыву над водой");
    }

    @Override
    public void run() {
        System.out.println("шлепаю лапками");
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public Duck(String name) {
        super(name);
    }
}
