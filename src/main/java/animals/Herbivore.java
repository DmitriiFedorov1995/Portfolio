package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{
    @Override
    public void eat(Food food) {
        if(!(food instanceof Grass)){
            System.out.println("Я не ем мясо!");
        }else this.satiety += food.getEnergy();
    }
}
