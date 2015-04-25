/**
 * Created by Refael_Paz on 25/04/2015.
 */

class main
{
    public static void main(String[] args)
    {
        MaxHeapArr maxHeapArr = new MaxHeapArr(2);
        int total_nums = 10;
        int[] num_arr = {1,2,3,4,5,6};
        int[] num_arr2 = {6,9,-1,7};

        maxHeapArr.InitializeArr(0, num_arr);
        maxHeapArr.InitializeArr(1, num_arr2);

        for (int i= 0; i < total_nums; i++)
        {
            System.out.println(maxHeapArr.GetTotalMax());
        }


        //maxHeapArr.PrintArr(0);

        //System.out.println(maxHeapArr.GetTotalMax());



    }

}