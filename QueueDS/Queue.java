public class Queue {
    private int head;
    private int tail;
    private int[] queue;
    private int size;

    public Queue(int size) {
        this.size += size;
        this.queue = new int[size];
        this.head = -1;
        this.tail = 0;
    }

    public void enQueue(int num) {
        if (head == -1) { // Inicializa a queue quando estiver vazia
            head++;
            queue[tail] = num;
        } else if ((tail + 1) % size != head) {
            // resolve o problema da tail quando chega na capacidade maxima do array
            // posicionando o elemento pelo seu modulo faz com que o array se torne circular
            tail = (tail + 1) % size;
            queue[tail] = num;

        } else {

            System.out.println("Fila cheia");
        }

    }

    public void deQueue() {
        // caso a função dequeue seja chamada quando a tail for igual a head
        // a fila irá tornar-se vazia novamente
        if (head != -1 && head != tail) {
            queue[head] = -1;
            head = (head + 1) % size;
        } else if(head == tail){
            queue[head] = -1;
            head = -1; // seta a fila como vazia
            tail = 0;
        }
    }

    public boolean isEmpty(){
        return head == -1;
    }
    public boolean isFull(){
        return (tail + 1) % size == head;
    }

    public void show(){
        for(int i = 0; i<size-1;i++){
            System.out.print("["+queue[i]+"], ");
        }
        System.out.print("["+queue[size-1]+"]"); // acrescentando algumas firulas
        System.out.println("\n");
    }
}



