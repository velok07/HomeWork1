package HW10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        String[] str = {"111", "212", "hello"};
        System.out.println(Arrays.toString(str));
        changeElements(str,0,1);
        System.out.println(Arrays.toString(str));

        //Задача 2
        Apple apple1 = new Apple("apple1");
        Apple apple2 = new Apple("apple2");
        Apple apple3 = new Apple("apple3");
        Apple apple4 = new Apple("apple4");
        Apple apple5 = new Apple("apple5");

        Orange orange1 = new Orange("orange1");
        Orange orange2 = new Orange("orange2");
        Orange orange3 = new Orange("orange3");

        Apple[] applesOne = {apple1,apple2,apple3};
        Apple[] applesTwo = {apple4, apple5};
        Orange[] oranges = {orange1, orange2, orange3};

        Box<Apple> appleBox = new Box<Apple>(applesOne);
        Box<Apple> appleBoxTwo = new Box<Apple>(applesTwo);
        Box<Orange> orangeBox = new Box<Orange>(oranges);

        System.out.println(appleBox.boxLength(applesOne));
        System.out.println(appleBoxTwo.boxLength(applesTwo));

        System.out.println(apple1.getWeight());
        System.out.println(appleBox.getWeight(apple1,applesOne));
        System.out.println(orangeBox.getWeight(orange2,oranges));



    }

    public static  <T> void changeElements(T[] array, int elementOne, int elementTwo){
        for (int i = 0; i < array.length; i++) {
            T reserveElement = array[elementOne];
            array[elementOne] =  array[elementTwo];
            array[elementTwo] = reserveElement;

        }
    }


}
