public class insertionSort {
    public static void main(String[] args) {
        int A[] = new int[]{33,22,11,77,2};
        insertionSort1(A);
    }

    public static void insertionSort1(int A[]){
        int n=A.length;
        for(int i=1;i<A.length;i++){
            int key = A[i];
            int j=i-1;
            while(j>=0 && A[j]>key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1]=key;
        }
        System.out.println();
        for(int num:A){
            System.out.print(num + " ");
        }
    }
}
