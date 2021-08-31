package ru.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5};
        swap (arr, 1, 4);
        String[] arr1 = {"A", "B", "C"};
        arrayToList(arr1);
        Box<Orange> b1 = new Box<>(new Orange(), new Orange(), new Orange());
        Box<Apple> b2 = new Box<>(new Apple(), new Apple());
        Box<Apple> b3 =new Box<>(new Apple());
        System.out.println(b1.compare(b2));
        b2.transfer(b3);
        System.out.println(b2.getWeight());
        System.out.println(b3.getWeight());





    }
    public static void swap (Object[] arr, int a, int b){
        Object temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static <T> void arrayToList(T[] arr){
        ArrayList<T> array = new ArrayList<>(Arrays.asList(arr));
        System.out.println(array);
    }

}
