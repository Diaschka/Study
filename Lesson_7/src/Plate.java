public class Plate {
    private int food;
    int maxAmountOfFood = 60;
    int minAmountOfFood = 0;

    public Plate() {
        this.food = maxAmountOfFood;
    }

    public int getFood(){
        return food;
    }

    public boolean tryDecreaseFood(int amount) {
        if ((food - amount) <= minAmountOfFood) {
            System.out.println("There is not enough food in the plate. Please add some.");
            return false;
        } else {
            System.out.println("Decreasing food.");
            food -= amount;
            return true;
        }
    }

    public void addFood(int moreFood) {
        if ((food + moreFood) > maxAmountOfFood) {
            System.out.println("The place is not that big for such amount of food. Add less food, please.");
        } else {
            food += moreFood;
        }
        System.out.println("Now you have added " + moreFood  + " pieces of food in your plate. So...");
    }
    public void info(){
        System.out.println("You have " + food + " pieces of food in your plate now.");
    }
}

