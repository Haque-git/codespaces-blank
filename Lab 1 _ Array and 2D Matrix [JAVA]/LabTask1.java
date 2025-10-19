//Lab Task 01: Merge Sorted Array
class LabTask1{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){

        int i = 0;
        int j = 0;
        int k = 0;

        Integer[] res = new Integer[arr1.length + arr2.length];
        while (true) {
            if(i >= arr1.length) {
                if (j < arr2.length) {
                    for (int l = j; l < arr2.length; l++) {
                        res[k] = arr2[l];
                        k++;
                    }
                }
                break;
            }
            if(j >= arr2.length) {
                if (i < arr1.length) {
                    for (int l = i; l < arr1.length; l++) {
                        res[k] = arr1[l];
                        k++;
                    }
                }
                break;
            }

            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {    
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        return res;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
