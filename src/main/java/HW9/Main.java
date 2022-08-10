package HW9;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        String[][] arrayOne = {{"10", "11", "7", "15" }, {"12", "10", "13", "10"}, {"2", "1", "17", "15"}, {"10", "3", "7", "13"}};
        try {
            System.out.println(arraySum(arrayOne));
        } catch (MyArrayDataException  e){
            System.out.println(e);
        }

        try {
            System.out.println(arraySum(arrayOne));
        } catch (MyArraySizeException e){
            System.out.println(e);
        }



    }

    public static int arraySum(String[][] array) {
        int sum = 0;
        int maybeInt = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Длина массива не равна 4Х4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Длина массива не равна 4Х4");
            }
        }
        for (int x = 0; x < array.length; x++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[x][j] + " ");
                try {
                    sum = sum + Integer.parseInt(array[x][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(array[x][j] + " не число, координаты : " + x + " " + j);
                }

//            System.out.println(Arrays.toString(array[i]));
            } System.out.println(" ");

        }return sum;
    }
}









