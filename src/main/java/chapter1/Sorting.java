package chapter1;
public class Sorting  {
    static int[] arr = {54, 76, 45, 4, 6, 3, 9 , 0, 3};

    public static void main(String[] args) {
        for( int v : insertionSort(arr)){
            System.out.print(v + ", ");
        };
    }

    public static int[] insertionSort(int [] arr){
        for(int j = 1; j <arr.length; j++){
            int k=arr[j];
            int i = j - 1;
            while (i>=0 && arr[i] > k){
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = k;
        }
        return arr;
    }
}
