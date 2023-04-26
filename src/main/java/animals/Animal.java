package animals;
import food.Food;

public abstract class Animal {


    protected int satiety;

    public int getSatiety() {
        return this.satiety;
    }

    public abstract void eat(Food food);
}
