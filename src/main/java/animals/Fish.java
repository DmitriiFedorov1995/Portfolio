package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public class Fish extends Carnivorous implements Swim{
    @Override
    public void swim() {
        System.out.println("Плыву под водой!");
    }
    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }
    public Fish(String name) {
        super(name);
    }
}
