package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary <T extends Animal>{

    private int aviaryMap;

    private Size size;
    public Aviary(Size size) {
        this.size = size;
        this.aviary = new HashMap<String, T>();
        this.aviaryMap = aviary.size();
    }

    private HashMap<String, T> aviary;

    public int getAviaryMap() {
        return aviaryMap;
    }

    public void addAnimal(Animal animal) {
        try{
            aviary.put(animal.getName(), (T) animal);
        }catch (WrongSizeException e){
            throw e;
        }finally {
            this.aviaryMap = aviary.size();
        }
    }

    public Animal getAnimal(String name){
        return (Animal) aviary.get(name);
    }

    public boolean removeAnimal( String name){
        if(aviary.containsKey(name)){
            aviary.remove(name);
            this.aviaryMap = aviary.size();
            return true;
        }else return false;
    }
}
