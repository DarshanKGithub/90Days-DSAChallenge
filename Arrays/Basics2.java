package Arrays;

public class Basics2 {
  
     public static void update(int marks[]){
           //Traverse and update
           for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
           }
     }

     public static void printUpdateArray(int marks[]){
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
     }


    public static void main(String[] args) {
        int marks[] = {99,98,99};
        update(marks);
        printUpdateArray(marks);
    }
}
