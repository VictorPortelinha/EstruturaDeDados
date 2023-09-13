public class Merge {

    public static QueueLinkedList MergeQueue(QueueLinkedList queue1, QueueLinkedList queue2){
        QueueLinkedList mergedQueue = new QueueLinkedList();

        // Copiando todos os dados da primeira e segunda fila para o merge

        mergedQueue.setHead(queue1.getHead());
        mergedQueue.setTail(queue1.getTail());
        mergedQueue.getTail().next = queue2.getHead();
        mergedQueue.setTail(queue2.tail);
        mergedQueue.BubbleSort();
        return mergedQueue;

    }

    public static int[] MergeArray(int[]arr1,int[]arr2){
        int size = arr1.length + arr2.length;
        int[] mergedArray = new int[size];
        for(int i=0;i<arr1.length;i++){
            mergedArray[i] = arr1[i];
        }
        int c=0;
        for(int j=arr1.length;j<size;j++){
            mergedArray[j] = arr2[c];
            c++;
        }
        return mergedArray;
    }


}
