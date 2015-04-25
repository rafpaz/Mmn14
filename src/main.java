/**
 * Created by Refael_Paz on 25/04/2015.
 */

class main
{
    public static void main(String[] args)
    {
        MaxHeapArr maxHeapArr = new MaxHeapArr(3);
        int[] num_arr = {1,2,3,4,5,6};
        int[] num_arr2 = {6,9,-1,7,5,6};

        maxHeapArr.InitializeArr(0, num_arr);
        maxHeapArr.PrintArr(0);
        System.out.println(maxHeapArr.GetMax(0));
        maxHeapArr.PrintArr(0);
        maxHeapArr.Insert(0, 80);
        maxHeapArr.PrintArr(0);

        System.out.println(maxHeapArr.GetMax(0));
        maxHeapArr.PrintArr(0);


    }

}