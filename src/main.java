import java.io.File;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Refael_Paz on 25/04/2015.
 */

class main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n and k (space between): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = RandomArrayGenerator.GetRandomArray(n);

        MaxHeapArr maxHeapArr = new MaxHeapArr(arr,k);

        maxHeapArr.PrintSortedArray();

    }

}