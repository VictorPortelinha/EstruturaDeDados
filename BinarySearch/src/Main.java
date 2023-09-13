public class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,9,22,40,60,70};
        int dado = 40;
        int index = BuscaBinaria.BuscaBinaria(arr,arr.length,dado);
        if(index == -1){
            System.out.println("Dado não encontrado");
        }else{
            System.out.println("Dado foi "+ dado + " foi encontrado na posiçao "+index);
        }

    }
}