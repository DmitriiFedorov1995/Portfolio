package employee;

import animals.Animal;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

public class Worker {
    public void feed(Animal animal, Food food){
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            throw new RuntimeException(e);
        }
    }

    public void getVoice(Voice animal){
        System.out.println(animal.getVoice());
    }
}
