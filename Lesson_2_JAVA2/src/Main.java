public class Main {
    public static void main(String[] args) {

        String[][] array;
        int sum = 0;
        try {
            array = initializeArray(4,4);
        }catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("You got " + e.getRow() + " on "+ e.getColumn()+" array.");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try{
                    sum += Integer.parseInt(array[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("The data in cell [" + i + "]["+ j +"] does not belong to INT type.");
                }
            }
        }System.out.println("The sum of the elements equals " + sum + ".");
    }

    public static String[][] initializeArray(int row,int column) throws MyArraySizeException {

        if (row != 4  || column != 4){
            throw new MyArraySizeException("The array size must be 4 on 4.", row, column);
        }
        String[][] array = {
                {"1","1","1","1"},
                {"2","2","2","2"},
                {"3","3","3","3"},
                {"4","4","4","4"}
        };
        return array;
    }
}
