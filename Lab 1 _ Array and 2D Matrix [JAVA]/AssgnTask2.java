//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        Integer[][] res = new Integer[matrix.length/2][matrix[0].length/2];
        for (Integer[] integers : res) {
            for (int i = 0; i < integers.length; i++) {
                integers[i] = 0;
            }
        }
        
        
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            int y = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                res[x][y] += matrix[i][j];
                if (j%2 != 0) {
                    y++;
                }
            }
            if (i%2 != 0) {
                x++;
            }
        }


        return res;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
