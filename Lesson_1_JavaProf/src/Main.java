import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxApples1 = new Box<Apple>();
        Box<Apple> boxApples2 = new Box<Apple>();
        Box<Orange> boxOrange1 = new Box<Orange>();

        // добавили фрукты
        for (int i = 0; i < 10; i ++)
            boxApples1.addFruit(new Apple());

        for (int i = 0; i < 20; i ++)
            boxApples2.addFruit(new Apple());

        for (int i = 0; i < 10; i ++)
            boxOrange1.addFruit(new Orange());

        // подсчет веса одной коробки

        boxApples1.compare(boxApples2);
        boxApples1.compare(boxOrange1);
        boxApples2.compare(boxOrange1);

        boxApples1.move(boxApples2);
        //boxApples1.move(boxOrange1);
    }

    // метод преобразования массива в arrayList
    public static <T> ArrayList<T> changeArrToArrayList(T[] array){
        return new ArrayList<T>(Arrays.asList(array));
    }

    // метод замены элементов
    public static <T> void elementsChange(T[] array,int indexI,int indexJ ){
        T temp = array[indexI];
        array[indexI] = array[indexJ];
        array[indexJ] = temp;
    }
}
