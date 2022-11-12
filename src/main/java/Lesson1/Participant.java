package Lesson1;

public abstract class Participant {
    abstract String getName();
    abstract boolean isOnDistance();

    abstract void run(int distance);

    abstract void jump(int height);

    abstract void swim(int distance);
}
