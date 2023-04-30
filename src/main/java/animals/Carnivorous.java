package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal{
    @Override
    public void eat(Food food) throws WrongFoodException{
            if (!(food instanceof Meat)) {
               throw new WrongFoodException();
            } else
                this.satiety += food.getEnergy();
    }

    public Carnivorous (String name){
        super(name);
    }
}
