package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary <T extends Animal>{

    private Size size;
    public Aviary(Size size) {
        this.size = size;
        this.aviaryMap = new HashMap<String, T>();
    }

    private HashMap<String, T> aviaryMap;



    public void addAnimal(Animal animal) {
        try{
            aviaryMap.put(animal.getName(), (T) animal);
        }catch (WrongSizeException e){
            throw e;
        }
    }

    public Animal getAnimal(String name){
        return (Animal) aviaryMap.get(name);
    }

    public boolean removeAnimal( String name){
        if(aviaryMap.containsKey(name)){
            aviaryMap.remove(name);
            return true;
        }else return false;
    }
}
