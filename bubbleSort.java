public class bubbleSort {
    public static void main(String[] args) {
        int A[] = new int[]{33,22,11,77,2};
        bubbleSort1(A);
    }

    public static void bubbleSort1(int A[]){
        int n=A.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        
        System.out.println();
        for(int num:A){
            System.out.print(num + " ");
        }
    }
}
