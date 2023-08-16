public class Moda {
    public static int procurarModa(int arr[]){
        int moda = 0;
        int aux = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int modaSearch = arr[i];
            for(int j=0;j<modaSearch;j++){
                if(modaSearch == arr[i]){
                    count++;
                }
            }
            if(count>aux){
                moda = modaSearch;
            }
        }
        return moda;
    }
}
