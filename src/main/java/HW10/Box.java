package HW10;

public class Box<T> {
        private T[] fruitBox;


    public Box(T[] fruitBox) {
        this.fruitBox = fruitBox;
    }

    public int boxLength(T... fruitBox){
        int fruitCount = 0;
        for (int i = 0; i < fruitBox.length ; i++) {
            fruitCount++;
        }
            return fruitCount;
    }

    int getWeight(Fruit f, T... fruitBox){
        int fruitCount = 0;
        for (int i = 0; i < fruitBox.length ; i++) {
            fruitCount++;
        }
        return f.getWeight()*fruitCount;
    }

}





