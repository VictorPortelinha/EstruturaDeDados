public class Merge {

    public static QueueLinkedList MergeQueue(QueueLinkedList queue1, QueueLinkedList queue2){
        QueueLinkedList mergedQueue = new QueueLinkedList();
        if(!queue1.isSorted() || !queue2.isSorted()){
            System.out.println("Ordene as filas antes de começar a operação de merge");
            return null;
        }

        // Copiando todos os dados da primeira fila para o merge
        QueueLinkedList.Node temp = queue1.getHead();
        while(temp != null){ //
            mergedQueue.enqueue(temp.data);
            temp = temp.next;
        }
        mergedQueue.getTail().next = queue2.getHead();
        mergedQueue.setTail(queue2.tail);

        return mergedQueue;

    }


}
