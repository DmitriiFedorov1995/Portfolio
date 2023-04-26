package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{
    @Override
    public void eat(Food food) {
        if(!(food instanceof Meat)){
            System.out.println("Я не ем траву!");
        }else this.satiety++;
    }
}
