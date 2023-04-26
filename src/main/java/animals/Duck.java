package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice{

    @Override
    public String getVoice() {
        return "Krya krya";
    }

    @Override
    public void fly() {
        System.out.println("шлепаю");
    }

    @Override
    public void swim() {
        System.out.println("Плыву над водой");
    }
}
