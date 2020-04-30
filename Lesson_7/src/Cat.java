public class Cat {
    private String name;
    private int appetite;
    private int fullness = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return this.name;
    }

    public int getFullness() {
        return this.fullness;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eats.");
        boolean hasCatEated = plate.tryDecreaseFood(appetite - fullness);

        if (hasCatEated)
            fullness = appetite;
    }
}





