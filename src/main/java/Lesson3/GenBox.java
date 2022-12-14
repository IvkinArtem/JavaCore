package Lesson3;

public class GenBox<T> {
    private T object;

    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        GenBox<Integer> genBox1 = new GenBox(5);
        GenBox<Integer> genBox2 = new GenBox(10);

        int summ = genBox1.getObject() + genBox2.getObject();

        System.out.println(summ);

    }





}
