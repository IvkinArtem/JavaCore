package Lesson3;

import java.util.Arrays;

public class NumbersBox<T extends Number> {
    private T[] array;

    public NumbersBox(T... array){
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double calcAverage(){
        double sum = 0.0;

        for (T num : array) {
            sum = sum + num.doubleValue();
        }
        return sum / array.length;
    }

    public boolean isSameAverage(NumbersBox<?> boxToCompare){
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) <0.001;



    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox){
        return numbersBox.getArray()[0];
    }

    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox = new NumbersBox<>(1,3,4,5,6,7,7);
        System.out.println(integerNumbersBox.calcAverage());


        System.out.println(getFirstElement(integerNumbersBox));

    }


}
