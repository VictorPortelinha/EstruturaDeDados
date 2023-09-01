public class QueueLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    class Queue{
        Node head,tail;

        Queue(){
            this.head= null;
            this.tail = null;
        }

        public void enqueue(int data){
            Node createNode = new Node(data);
            if (this.tail == null){ // se a fila estiver vazia, a cabeça e a cauda são inicializadas
                this.head = createNode;
                this.tail = createNode;
            }
            this.tail.next = createNode;
            this.tail = createNode;

        }

        public void dequeue(int data){

        }
    }
}
