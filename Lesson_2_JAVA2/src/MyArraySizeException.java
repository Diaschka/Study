public class MyArraySizeException extends Exception {
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public MyArraySizeException(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public MyArraySizeException(String message, int row, int column) {
        super(message);
        this.row = row;
        this.column = column;
    }


}
