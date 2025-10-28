package Arrays;

public class BinarySearch {

     public static int binarySearch(int number[], int key){
         int start = 0, end = number.length - 1;

         //comparison
         int mid = (start + end) / 2;
         if(number[mid] == key){
             return mid;
         }if(number[mid] < key){
             start = mid + 1;
         } else {
             end = mid - 1;
         }
         return -1;
     }

    public static void main(String[] args) {
        int number[] = { 2, 4 ,6,8,10,12,14,45,63};
        int key = 10;
        System.out.println("Element found at index: " + binarySearch(number, key));
    }
}
