package Lesson3.houseAtTree;

public class HouseAtTree<T extends Animal & Flyable> {
    private T master;

    public HouseAtTree(T master) {
        this.master = master;
    }

    public T getMaster() {
        return master;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "HouseAtTree{" +
                "master=" + master +
                '}';
    }

    public static void main(String[] args) {
        //HouseAtTree<Cat> catHouse = new HouseAtTree<>(new Cat());
        //HouseAtTree<Plane> planeHouseAtTree;
        HouseAtTree<Birds> birdsHouseAtTree = new HouseAtTree<>(new Birds());

    }

}
