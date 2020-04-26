public class Main {

    public static void main(String[] args) {
        Cats cat1 = new Cats();
        Dogs dog1 = new Dogs();
        Dogs dog2 = new Dogs();

        cat1.Run(100);
        cat1.Swim(10);
        cat1.Barrier(1.75);

        dog1.Run(550);
        dog1.Swim(9);
        dog1.Barrier(0.15);

        dog2.Run(400);
        dog2.Swim(12);
        dog2.Barrier(2);

    }

}
