/**
 * Created by Refael_Paz on 25/04/2015.
 */

class main
{
    public static void main(String[] args)
    {
        MaxHeapArr maxHeapArr = new MaxHeapArr(2);
        int[] num_arr = {6,5,3,4,2,1};
        int[] num_arr2 = {6,9,-1,7};

        maxHeapArr.InitializeArr(0, num_arr);
        maxHeapArr.InitializeArr(1, num_arr2);

        maxHeapArr.PrintSortedArray();

    }

}