package Lesson3.comparable;


public class Box2 implements Comparable<Box2>{
    private int size;

    public Box2(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';

    }

    public int compareTo(Box2 o){
        return getSize()- o.getSize();

    }

}
