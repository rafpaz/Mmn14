import java.util.List;

/**
 * Created by Refael_Paz on 25/04/2015.
 */
public class MaxHeapList
{
    private List<MaxHeap> m_maxHeapList;

    public void AddMaxHeap(int[] num_arr)
    {
        MaxHeap tmpList = new MaxHeap(num_arr.length);
        for (int i : num_arr)
        {
            tmpList.insert(i);
        }
        m_maxHeapList.add(tmpList);
    }

    public void PrintList()
    {
        for(MaxHeap curr_list : m_maxHeapList)
        {
            curr_list.print();
        }
    }

    public int RemoveMax()
    {
        int max_num = m_maxHeapList.get(0).GetMax();
        int i = 0;
        for (MaxHeap curr_list : m_maxHeapList)
        {

        }
        return i;
    }


}
