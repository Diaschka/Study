import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        float boxWeight = 0;

        for (T fruit: this.fruits) {
            boxWeight += fruit.getWeight();
        }

        return boxWeight;
    }

    public boolean equals(Box<?> boxToCompare) {
        return this.getWeight() == boxToCompare.getWeight();
    }

    public void move(Box<T> boxToMove) {
        for (T fruit : this.fruits) {
            boxToMove.addFruit(fruit);
        }

        this.fruits.clear();

    }
}
