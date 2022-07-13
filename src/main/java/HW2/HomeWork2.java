package HW2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(checkSum(3,7));
//        positiveNegative(-1);
//        System.out.println(checkNumber(-3));
//        printString("Hello world!", 5);
//        System.out.println(leapYearOrNot(200));
    }

    public static boolean checkSum (int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <=20){
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNegative (int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumber (int a){

        if (a < 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printString (String str, int a){
        for (int i = 0; i < a ; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYearOrNot (int year){
        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0 ){
            return true;
        } else {
            return false;
        }
    }
}
