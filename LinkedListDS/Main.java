public class Main {
    public static void main(String[] args) {


        QueueLinkedList list1 = new QueueLinkedList();

        list1.enqueue(2);
        list1.enqueue(3);
        list1.enqueue(5);
        list1.dequeue();
        list1.dequeue();
        list1.show();


    }
}
