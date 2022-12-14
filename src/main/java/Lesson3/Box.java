package Lesson3;

public class Box {
    private Object object;

    public Box(Object object){
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + object +
                '}';
    }


    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(5);

        System.out.println(box1.getObject().getClass());




    }
}
