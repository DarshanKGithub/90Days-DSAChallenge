package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
         int[] arr = {34,65,85,0,12,45,63,5};
         int secondLargest = findSecondLargest(arr);
            System.out.println("Second largest element in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
