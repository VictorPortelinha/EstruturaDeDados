public class BuscaBinaria {
    public static int BuscaBinaria(int arr[],int size,int data){
        int sup = size-1;
        int inf = 0;
        while(inf <= sup){
            int meio = inf + (sup-inf)/2;
            if (arr[meio] == data){
                return meio;
            }
            if(arr[meio] < data) {
                inf = meio + 1;
            }else{
                sup = meio - 1;
            }
        }
        return -1;
    }
}
