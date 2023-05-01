package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public class Kotik extends Carnivorous implements Voice, Run{
    @Override
    public String getVoice() {
        return "Meow";
    }

    @Override
    public void run() {
        System.out.println("бегаю быстро");
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public Kotik(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        try {
            super.eat(food);
        }catch (WrongFoodException e){
            e.printStackTrace();
        }
    }

    private static final int METHODS = 5;
    private int weight;
    private String voice;

    private static int count; //counter for implements objects

    public Kotik() {
        super("Barsik");
        this.satiety = 0;
        this.weight = 0;
        this.voice = "High";
        ++count;
    }

    public Kotik(String name, String voice, int satiety, int weight){
       //constructor with all properties
        super(name);
        this.satiety = satiety;
        this.weight = weight;
        this.voice = voice;
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    /*public String getVoice(){
        return this.voice;
    }*/



    public void setVoice (String voice){
        this.voice = voice;
    }

    public int getSatiety(){
        return  this.satiety;
    }

    public void setSatiety(int satiety){
        this.satiety = satiety;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public boolean play(){
        if (this.satiety > 0){
            // System.out.println("play");
            --this.satiety;
            return true;
        }else return false;
    }

    public boolean sleep (){
        if (this.satiety > 0){
            //System.out.println("sleep");
            --this.satiety;
            return true;
        }else return false;
    }

    public boolean wash (){
        if (this.satiety > 0){
            //System.out.println("wash");
            --this.satiety;
            return true;
        }else return false;
    }

    public boolean hunt (){
        if (this.satiety > 0){
            //System.out.println("hunt");
            --this.satiety;
            return true;
        }else return false;
    }

    public boolean walk (){
        if (this.satiety > 0){
            //System.out.println("walk");
            --this.satiety;
            return true;
        }else return false;
    }

    public void eat(int satiety){
        this.satiety = this.satiety + satiety;
    }

    public void eat(int satiety, String foodName){
        this.satiety = this.satiety + satiety;
    }

    public void eat(){
        this.eat(1, "meat");
    }

    public String[] liveAnotherDay(){
        String[] day = new String[24];
        for(int i =0; i <= 23; i++){
            double method = (Math.random()*METHODS)+1;
            switch((int) method){
                case 1:
                    if (play() == true){
                        day[i] = i+" - играл";
                    }else {eat(); day[i] =i+" - ел";}
                    break;
                case 2:
                    if (sleep() == true){
                        day[i] = i+" - спал";
                    }else {eat(); day[i] =i+" - ел";}
                    break;
                case 3:
                    if (wash() == true){
                        day[i] = i+" - умывался";
                    }else {eat(); day[i] =i+" - ел";}
                    break;
                case 4:
                    if (hunt() == true){
                        day[i] = i+" - охотился";
                    }else {eat(); day[i] =i+" - ел";}
                    break;
                case 5:
                    if (walk() == true){
                        day[i] = i+" - гулял";
                    }else {eat(); day[i] =i+" - ел";}
                    break;
            }
        }
        return day;
    }
}
