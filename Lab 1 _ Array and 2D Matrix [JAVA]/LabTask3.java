//Lab Task 03: Decryption Process
class LabTask3{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        Integer[] res = new Integer[matrix[0].length - 1];
        Integer[] colSum = new Integer[matrix[0].length]; 
        
        for (int col = 0; col < matrix[0].length; col++) {
            colSum[col] = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum[col] += matrix[row][col];
            }
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = colSum[i + 1] - colSum[i];
        }
        return res;  

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}