/**
 * Created by Refael_Paz on 25/04/2015.
 */
public class MaxHeapArr
{
    private MaxHeap[] m_maxHeapArr;

    public MaxHeapArr(int num_of_heaps)
    {
        m_maxHeapArr = new MaxHeap[num_of_heaps];
    }

    public void InitializeArr(int current_heap,int[] num_arr)
    {
        m_maxHeapArr[current_heap] = new MaxHeap(num_arr.length);
        for (int i : num_arr )
        {
            m_maxHeapArr[current_heap].insert(i);
        }
    }

    public void PrintArr(int heap_to_print)
    {
        m_maxHeapArr[heap_to_print].print();
    }

    public int GetMax(int current_heap)
    {
        return m_maxHeapArr[current_heap].remove();
    }

    public void Insert(int current_heap,int num_to_insert)
    {
        m_maxHeapArr[current_heap].insert(num_to_insert);
    }
}
