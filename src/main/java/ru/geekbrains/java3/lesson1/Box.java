package ru.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{
    private ArrayList<T> container;

    public ArrayList<T> getContainer() {
        return container;
    }

    public Box(T... fruits){
        container = new ArrayList<T>(Arrays.asList(fruits));
    }
    public void add (T fruit){
        container.add(fruit);
    }
    public float getWeight(){
        float w = 0.0f;
        for (Fruit o : container){
            w += o.getWeight();
        }
        return w;
    }
    public boolean compare (Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }
    public void transfer(Box<T> another){
        another.container.addAll(this.container);
        this.container.clear();
    }
}
