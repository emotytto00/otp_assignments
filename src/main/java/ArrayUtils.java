public class ArrayUtils {

    // Method to get a predefined single-dimensional array of integers
    public int[] getSingleDimensionalArray() {
        return new int[]{2, 3, 5, 7};
    }

    public int[] getDifferentSingleDimensionalArray() {
        return new int[]{2, 3, 5, 8};
    }

    public int[][] getMultiDimensionalArray() {
        return new int[][]{
                {2, 3},
                {5, 7},
                {11, 13}
        };
    }

    public int[][] getDifferentMultiDimensionalArray() {
        return new int[][]{
                {2, 3},
                {5, 8},
                {11, 13}
        };
    }

    public String[] getStringArray() {
        return new String[]{"apple", "banana", "cherry"};
    }

    public String[] getDifferentStringArray() {
        return new String[]{"apple", "banana", "grape"};
    }

    public double[] getDoubleArray() {
        return new double[]{1.0, 2.0, 3.0};
    }

    public double[] getDifferentDoubleArray() {
        return new double[]{1.0, 2.0, 4.0};
    }
}
