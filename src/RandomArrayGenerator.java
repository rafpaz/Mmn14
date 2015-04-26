import java.util.Arrays;
import java.util.Random;

/**
 * Created by Refael_Paz on 26/04/2015.
 */
public class RandomArrayGenerator
{
    public static int[] GetRandomArray(int size)
    {
       int[] arr = new int[size];
       Random random = new Random();

        for (int i = 0; i < size; i++ )
        {
            arr[i] = random.nextInt(255);
        }

        Arrays.sort(arr);
        return arr;
    }
}
