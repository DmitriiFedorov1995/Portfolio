package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public class Kotik extends Carnivorous implements Voice, Run{
    @Override
    public String getVoice() {
        return "Meow";
    }

    @Override
    public void run() {
        System.out.println("бегаю быстро");
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public Kotik(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        try {
            super.eat(food);
        }catch (WrongFoodException e){
            e.printStackTrace();
        }
    }
}
