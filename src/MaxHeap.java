import java.util.Scanner;

public class MaxHeap
{
    private int[] Heap;
    private int size;
    private int maxsize;

    private static final int FRONT = 1;

    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;

    }

    public int getSize()
    {
        return size;
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return (2 * pos);
    }

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
        if ( (pos > (size / 2) && pos <= size) || size == 0)
        {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void maxHeapify(int pos)
    {
        if (!isLeaf(pos))
        {
            if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                }
                else
                {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element)
    {
        Heap[++size] = element;
        int current = size;

        while (Heap[current] > Heap[parent(current)])
        {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++)
        {
            System.out.print("PARENT : " + Heap[i]);

            if (2*i <= size)
            {
                System.out.print(" LEFT CHILD : " + Heap[2*i]);
            }
            if (2*i +1 <= size)
            {
                System.out.print(" RIGHT CHILD :" + Heap[2 * i + 1]);
            }
            System.out.println();
        }
    }

    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }

    public int removeMax()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        maxHeapify(FRONT);
        return popped;
    }

    public int GetMax()
    {
        return Heap[FRONT];
    }




}
