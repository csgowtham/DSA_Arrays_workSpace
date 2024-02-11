//Java Code to Reverse a Array Inplace
public class reverse_array {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5}; 
        int i=0,j=arr.length-1;
        System.out.println("Array Length : "+arr.length );
        for(int c=0;c<arr.length;c++){
            System.out.print(arr[c] + " ");
        }
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("\nReversed Array : ");
        for(int c=0;c<arr.length;c++){
            System.out.print(arr[c] + " ");
        }
    }
}
