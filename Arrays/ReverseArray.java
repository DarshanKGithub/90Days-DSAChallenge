package Arrays;

public class ReverseArray {
    public static void reverseArray(int[] number){
        int first = 0, last = number.length - 1;

        while(first < last){
            //Swapping
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("Reversed Array"+reverseArray(number));
        reverseArray(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();

    }


}
