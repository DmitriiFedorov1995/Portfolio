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

    public Size getSize() {
        return size;
    }

    public void addAnimal(T t) {
       if (t.getSize().equals(this.size)) {
           aviaryMap.put(t.getName(), t);
       }else throw new WrongSizeException();
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
