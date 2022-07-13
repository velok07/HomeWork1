package HW1;

public class HomeWorkApp {
    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign(-10, 5);
//        printColor(1001);
          compareNumbers(5, 5);
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign (int a, int b){
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int a){
        if (a <= 0){
            System.out.println("Красный");
        } else if (a > 0 && a <= 100){
            System.out.println("Желтый");
        } else if (a > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers (int a, int b){
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
