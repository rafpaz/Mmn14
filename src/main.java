/**
 * Created by Refael_Paz on 25/04/2015.
 */

class main
{
    public static void main(String[] args)
    {
        MaxHeap[] heapArr = new MaxHeap[3];

        heapArr[0] = new MaxHeap(3);
        heapArr[0].insert(3);
        heapArr[0].insert(8);

        heapArr[1] = new MaxHeap(5);
        heapArr[1].insert(-9);
        heapArr[1].insert(-3);
        heapArr[1].insert(0);

        System.out.println("First Heap: ");
        heapArr[0].print();

        System.out.println("Second Heap: ");
        heapArr[1].print();



//        System.out.println("The Max Heap is ");
//        MaxHeap maxHeap = new MaxHeap(15);
//        maxHeap.insert(5);
//        maxHeap.insert(3);
//        maxHeap.insert(17);
//        maxHeap.insert(10);
//        maxHeap.insert(84);
//        maxHeap.insert(19);
//        maxHeap.insert(6);
//        maxHeap.insert(22);
//        maxHeap.insert(9);
//
//        maxHeap.maxHeap();
//
//        maxHeap.print();
//        System.out.println("The max val is " + maxHeap.remove());
//
//        maxHeap.print();
//        System.out.println("The max val is " + maxHeap.remove());
    }

}