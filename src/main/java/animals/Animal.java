package animals;
import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {

    protected String name;

    protected int satiety;

    public int getSatiety() {
        return this.satiety;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract Size getSize();
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
