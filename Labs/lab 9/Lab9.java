
public class Lab9 {
    public static void addTo10(int[][] array) {
        // running through rows and declaring variables
        for (int i = 0; i < array.length; i++) {
            int sumRow = 0;
            int index = 0;
            int currentNum;
            // going through the individuals data
            for (int j = 0; j < array[i].length; j++) {
                sumRow = sumRow + array[i][j];
                currentNum = array[i][j];
                if (currentNum == 0) {
                    index = j;
                }
            }
            int remaining = 10 - sumRow;
            array[i][index] = remaining;
        }
    }

    public static void setHints(int[][] array) {
        // checking from rows to columns in each of the matrixs
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // checking for the is bomb variable which is -1 of the arrays and find the -1 variable which then indicates either 1 or 2
                if (isBomb(array[i][j])) {
                    for (int k = -1; k < 2; k++) {
                        for (int a = -1; a < 2; a++) {
                            // for outofbonds exceptions which matches the matrix and number variable together
                            if (isInBounds(i + k, j + a, array)) {
                                int value = array[i + k][j + a];
                                if (!isBomb(value)) {
                                   array[i + k][j + a] += 1;}
                                }
                            }
                        }
                    }
                }
            }
        }


        public static boolean isInBounds ( int i, int j, int[][] board){
            return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
        }

        public static boolean isBomb ( int value){
            return value == -1;
        }


        public static void main (String[]args){

            int[][] matrix = {
                    {6, 3, 2, 0, 4},
                    {34, 53, 0, 23, 1},
                    {0, 23, 54, 11, 7}
            };

            int[][] matrix2 = {
                    {-1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, -1, 0, -1},
                    {0, 0, 0, -1, 0, 0},
                    {0, 0, 0, 0, 0, 0}
            };


            int[][] matrix3 = {
                    {0, -1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 0},
                    {-1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0}};

            addTo10(matrix);
            setHints(matrix2);
            setHints(matrix3);

        }

    }





