
public class Main {

    public static void main(String[] args) {


        // п.1
        int[] array1 = {1,1,0,0,0,1,1,1,0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0){
                array1[i] = 1;
                //System.out.println(array1[i]);
            } else {
                array1[i] = 0;
                //System.out.println(array1[i]);
            }
        }

        // п.2
        int[] array2 = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i*3;
            //System.out.println(array2[i] + " ");
        }

        // п.3

        int[] array3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
                System.out.print(array3[i] + " ");
            } else {
                System.out.print(array3[i] +" ");
            }
        }

        // п.4
        int n = 7;
        int[][] array4 = new int[n][n];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if(i == j || (i + j) == (array4.length - 1)) {
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + "\t");
            }
            System.out.println();
        }

        // п.5
        int[] array5 = {3,76,543,6,2,0,34,56,2,81};




    }
}
