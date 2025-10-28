package Arrays;

//Finding the largest element in the array
public class Basics3 {

    public static int smallestElementArray(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];

            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[]  = {2,3,9,8,4,1,6};
        int smallestIndex = smallestElementArray(arr);
        System.out.println("Smallest index at found: "+smallestIndex);
    }
}
