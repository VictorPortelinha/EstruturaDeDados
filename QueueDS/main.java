class main {
    public static void main(String[] args) {
        int size = 5;
        Queue queue = new Queue(size);
        for(int i =0;i<5;i++){ // popula a queue com valores de 0-(size-1)
            queue.enQueue(i);
        }

        queue.show();
        System.out.println(queue.isFull()+"\n");

       for(int j = 0;j<5;j++){
           queue.deQueue();
       }

        queue.show();
        System.out.println(queue.isEmpty()+"\n");

        for(int i =0;i<5;i++){ // popula a queue com valores de 0-(size-1)
            queue.enQueue(i);
        }

        queue.deQueue(); // teste do array circular
        queue.deQueue();
        queue.show();

        queue.enQueue(9);
        queue.enQueue(8);
        queue.show();

        queue.enQueue(10);
        queue.show();

        queue.deQueue();
        queue.enQueue(10);
        queue.show();

    }


}
