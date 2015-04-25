/**
 * Created by Refael_Paz on 25/04/2015.
 */
public class MaxHeapArr
{
    private MaxHeap[] m_maxHeapArr;
    private int m_numOfFullHeaps;

    public void PrintSortedArray()
    {
        while (m_numOfFullHeaps > 0)
        {
            System.out.println(GetTotalMax());
        }
    }

    public MaxHeapArr(int num_of_heaps)
    {
        m_maxHeapArr = new MaxHeap[num_of_heaps];
        m_numOfFullHeaps = num_of_heaps;
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

    public int RemoveMax(int current_heap)
    {
        return m_maxHeapArr[current_heap].removeMax();
    }

    public void Insert(int current_heap,int num_to_insert)
    {
        m_maxHeapArr[current_heap].insert(num_to_insert);
    }

    public int GetTotalMax()
    {
        int first_full_heap = GetFirstFullHeap();
        int max_num = m_maxHeapArr[first_full_heap].GetMax();
        int max_num_heap = first_full_heap;
        for (int i = first_full_heap + 1; i < m_maxHeapArr.length; i++)
        {
            if(m_maxHeapArr[i].getSize() > 0 && max_num < m_maxHeapArr[i].GetMax())
            {
                max_num = m_maxHeapArr[i].GetMax();
                max_num_heap = i;
            }
        }
        if (m_maxHeapArr[max_num_heap].getSize() == 1)
            m_numOfFullHeaps--;
        return m_maxHeapArr[max_num_heap].removeMax();
    }

    private int GetFirstFullHeap()
    {
        boolean found = false;
        int i = 0;
        while (i < m_maxHeapArr.length && !found)
        {
            if (m_maxHeapArr[i].getSize() >= 1)
            {
                found = true;
            }
            else
            {
                i++;
            }
        }
        return i;
    }
}
