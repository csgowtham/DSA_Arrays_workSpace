public class selectionSort {
    public static void main(String[] args) {
        int A[] = new int[]{33,22,11,77,2};
        selSort(A);
    }

    public static void selSort(int A[]){
        int n=A.length;
        
        for(int i=0;i<n-1;i++){
            int min = A[i];
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(A[j]<min){
                    minIndex=j;
                    min=A[j];
                }
                               
            }
            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }
        System.out.println();
        for(int num:A){
            System.out.print(num + " ");
        }
    }
}
