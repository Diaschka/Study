public class Main {
    public static void main(String args[]) {
        Plate plateWithFood = new Plate();

        Cat[] catsArr = new Cat[7];
        {
            catsArr[0] = new Cat("Monday", 15);
            catsArr[1] = new Cat("Tuesday", 10);
            catsArr[2] = new Cat("Wednesday", 10);
            catsArr[3] = new Cat("Thursday", 15);
            catsArr[4] = new Cat("Friday", 10);
            catsArr[5] = new Cat("Saturday", 5);
            catsArr[6] = new Cat("Sunday", 10);
        }

        for (Cat cat : catsArr) {
            // кормим кота
            cat.eat(plateWithFood);
            System.out.println("Cat " + cat.getName() + " has fullness: " + cat.getFullness());
        }
        plateWithFood.info();

        plateWithFood.addFood(30);
        plateWithFood.info();

    }
}




