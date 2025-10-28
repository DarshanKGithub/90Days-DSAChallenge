package Arrays;

import java.util.Scanner;

//Creating a array and performing basic operation
public class Basic1 {
   public static void main(String[] args){
    int arr[] = new int[100];
    Scanner sc = new Scanner(System.in);
    int phy, chem, math;
    phy = sc.nextInt();
    chem = sc.nextInt();
    math = sc.nextInt();

    System.out.println("Phy: "+ phy);
    System.out.println("Chem: "+ chem);
    System.out.println("Math: "+ math);

    int percentage = (phy + chem + math) / 3;
    System.out.println("percentage = " + percentage + "%");
    System.out.println("Array Length: "+arr.length);


   }    

}
