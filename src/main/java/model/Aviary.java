package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary <T>{

    private Size size;
    public Aviary(Size size) {
        this.size = size;
        this.aviary = new HashMap<String, T>();
    }

    private HashMap<String, T> aviary;

    public void addAnimal(T t) {
        try{
            aviary.put(((Animal) t).getName(), t);
        }catch (WrongSizeException e){
            throw e;
        }
    }

    public T getAnimal(String name){
        return aviary.get(name);
    }

    public boolean removeAnimal( String name){
        if(aviary.containsKey(name)){
            aviary.remove(name);
            return true;
        }else return false;
    }
}
