package HW3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
//        callingArr();
//        fullingArr();
//        multiplicationArr();
        diagonalArr();
//        createArr(4,1);
        minMaxElement();

    }

    public static void callingArr (){
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;

        for (int i = 0; i < arr.length ; i++) {
            if (arr [i] == 1){
                arr [i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fullingArr (){
        int [] arr = new int[101];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    public static void multiplicationArr(){
        int [] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1  };
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void diagonalArr(){
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (i == j){
                    arr[i][j] = 1;
                }
                System.out.print (arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[] createArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static void minMaxElement(){

        int max = 0;
        int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println(max + " максимальный элемент");
        Arrays.sort(arr);
        System.out.println(arr[0] + " минимальный элемент");
    }
}
