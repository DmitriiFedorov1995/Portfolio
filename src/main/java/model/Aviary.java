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



    public void addAnimal(T t) throws WrongSizeException{
        try{
            aviaryMap.put(t.getName(), t);
        }catch (WrongSizeException e){
            throw e;
        }
    }

    public T getAnimal(String name){

        return aviaryMap.get(name);
    }

    public boolean removeAnimal( String name){
        if(aviaryMap.containsKey(name)){
            aviaryMap.remove(name);
            return true;
        }else return false;
    }
}
