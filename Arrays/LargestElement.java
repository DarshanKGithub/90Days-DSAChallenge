package Arrays;
public class LargestElement{
    public static void main(String[] args) {
        int[] arr = {34,65,85,0,12,45,63,5};
       int largest =  findLargest(arr);
       System.out.println("Largest element in the array is: " + largest);

    }
    public static int findLargest(int[] arr){
        int largest = arr[0];
        for( int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

        }
        return largest;
    }
}