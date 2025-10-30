package Arrays;

public class ArrayOfSum {
     public static int arrayOfSum(int[] arr){
         int size = arr.length;

         int count = 0;
         for(int i = 0; i < size; i++){
             count += arr[i];

         }
         return count;

     }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 9,};
        int sumOfArray = arrayOfSum(arr);
        System.out.println("Sum: " + sumOfArray);
    }
}
