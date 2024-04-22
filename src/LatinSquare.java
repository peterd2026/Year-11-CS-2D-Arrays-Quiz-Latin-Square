public class LatinSquare {

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the sum of consecutive integers 1 + 2 + ... + N
     */
    public static int targetCheckSum1(int rowSize) {
        int sum = 0;
        for (int i=1; i<= rowSize; i++){
            sum +=i;
        }
        return sum;
    }

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the product of consecutive integers 1 * 2 * ... * N
     */
    public static int targetCheckSum2(int rowSize) {
        int prod = 1;
        for (int i = 1; i <= rowSize; i++) {
            prod *= i;
        }
        return prod;
    }


    /**
     *
     * @param array2d
     * @return whether or not every row's sum in array2d is equal to targetCheckSum1(),
     *         AND that every row's product in array2d is equal to targetCheckSum2()
     */
    public static boolean isLatinRows(int[][] array2d) {
        int n = array2d.length;
        for (int i = 1; i < n; i++){
            int rowSum = 0;
            int rowProduct = 1;
            for(int j = 1; j<n; j++){
                rowSum += array2d[i][j];
                rowProduct *= array2d[i][j];
            }
            if (rowSum != targetCheckSum1(n) || rowProduct != targetCheckSum2(n)){
                return false;
            }
        }
        return true;

    }

    /**
     *
     * @param array2d
     * @return whether or not every column's sum in array2d is equal to targetCheckSum1(),
     *         AND that every column's product in array2d is equal to targetCheckSum2()
     */
    public static boolean isLatinColumns(int[][] array2d) {
        int d = array2d.length;
        for (int i = 1; i< d; i++){
            int columnSum = 0;
            int columnProduct = 1;
            for(int j=1; j<d; j++){
                columnSum += array2d[i][j];
                columnProduct *= array2d[i][j];
            }
            if (columnSum != targetCheckSum1(d) || columnProduct != targetCheckSum2(d)){
                return false;
            }
        }
        return true;
    }


    /**
     *
     * @param array2d
     * @return whether array2d is a Latin square or not.
     *         Hint: make use of isLatinRows and isLatinColumns
     */
    public static boolean isLatinSquare(int[][] array2d) {
        return isLatinRows(array2d) && isLatinColumns(array2d);

    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
