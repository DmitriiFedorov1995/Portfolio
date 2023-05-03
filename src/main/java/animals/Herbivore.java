package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal{
    @Override
    public void eat(Food food) throws WrongFoodException {
        if(!(food instanceof Grass)){
            throw new WrongFoodException();
        }else this.satiety += food.getEnergy();
    }
    public Herbivore(String name) {
        super(name);
    }
}
