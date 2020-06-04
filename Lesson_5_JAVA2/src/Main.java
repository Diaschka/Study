public class Main {

    static final int SIZE = 1000000;
    static final int HALFSIZE = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void arrayFilling(float[] array,int index){
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + (i + index)/5)*Math.cos(0.2f + (i + index)/5)* Math.cos(0.4f + (i + index)/5));
        }
    }

    public static void usualArrayFilling(){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        long startTime = System.currentTimeMillis();
        arrayFilling(arr,0);
        long finishTime = System.currentTimeMillis();
        System.out.println("Usual array filling takes " + (finishTime - startTime) + " milliseconds.");
        
    }
    
    public static void devidedArrayFilling(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        float[] arr1 = new float[HALFSIZE];
        float[] arr2 = new float[HALFSIZE];
        System.arraycopy(arr,0,arr1,0,HALFSIZE);
        System.arraycopy(arr,HALFSIZE,arr2,0,HALFSIZE);

        Thread t1 = new Thread(()-> {
            arrayFilling(arr1,0);
        });
        t1.start();

        Thread t2 = new Thread(()->{
            arrayFilling(arr2,HALFSIZE);
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1,0,arr,0,HALFSIZE);
        System.arraycopy(arr2,0,arr,HALFSIZE,HALFSIZE);

        long finishTime = System.currentTimeMillis();

        System.out.println("Array filling with 2 threads takes " + (finishTime - startTime) + " milliseconds");

    }


    public static void main(String[] args) {
        usualArrayFilling();
        // for checking different values
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[300] = " + arr[300]);
        System.out.println("arr[700000] = " + arr[700000]);
        devidedArrayFilling();
        // for checking different values
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[300] = " + arr[300]);
        System.out.println("arr[700000] = " + arr[700000]);
    }
}
