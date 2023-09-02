public class Main {
    public static void main(String[] args) {


        QueueLinkedList queue1 = new QueueLinkedList();

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);


        QueueLinkedList queue2 = new QueueLinkedList();

        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.enqueue(6);

        QueueLinkedList mergedQueue = Merge.MergeQueue(queue1,queue2);

        assert mergedQueue != null;
        System.out.println("Merged queue: ");
        mergedQueue.show();

        System.out.println("Queue 1: ");

        queue1.show();

        System.out.println("Queue 2: ");

        queue2.show();

        queue1.dequeue();

        queue2.dequeue();
        queue2.dequeue();
        queue2.dequeue();


        System.out.println("Merged queue: ");
        mergedQueue.show();

        System.out.println("Queue 1: ");

        queue1.show();

        System.out.println("Queue 2: ");

        queue2.show();




    }
}
