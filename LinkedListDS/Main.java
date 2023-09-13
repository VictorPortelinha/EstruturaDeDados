public class Main {
    public static void main(String[] args) {

        
        QueueLinkedList queue1 = new QueueLinkedList();

        queue1.enqueue(5);
        queue1.enqueue(3);
        queue1.enqueue(2);


        queue1.BubbleSort();

        QueueLinkedList queue2 = new QueueLinkedList();

        queue2.enqueue(6);
        queue2.enqueue(5);
        queue2.enqueue(4);

        queue2.BubbleSort();
        System.out.println("Queue 1: ");
        queue1.show();
        System.out.println("Queue 2");
        queue2.show();
        QueueLinkedList mergedQueue = Merge.MergeQueue(queue1,queue2);
        System.out.println("Merged List");
        mergedQueue.show();
        mergedQueue.dequeue();
        System.out.println("Merged List");
        mergedQueue.show();
        System.out.println("Queue 2");
        queue2.show();

    }
}
