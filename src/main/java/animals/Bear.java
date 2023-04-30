package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public class Bear extends Carnivorous implements Run, Voice{
    @Override
    public void run() {
        System.out.println("Топаю");
    }

    @Override
    public String getVoice() {
        return "Ahrrr!";
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
            super.eat(food);
    }

    public Bear(String name) {
        super(name);
    }
}
