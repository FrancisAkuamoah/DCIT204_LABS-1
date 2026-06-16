 import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = scr.nextInt();
        int[] arr = new int [x];
        int arraySize = x;
        System.out.println("Array size: " + arraySize);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i + ": ");
            arr[i] = scr.nextInt();

        }    
       
       
        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        long duration = endTime -startTime;

        System.out.println("Duration" + duration + "nanoseconds");



        int result = Algorithms.LinearSearch(arr, 2);
        if(result != -1) {
            System.out.println(result);
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("NOT FOUND");
        }


        
        int result2 = Algorithms.BinarySearch(arr, 2);
        if(result2 != -1) {
             System.out.println(result2);
            System.out.println("Element found at index: " + result2);
        }
        else {
            System.out.println("NOT FOUND");
        }
    }
}
