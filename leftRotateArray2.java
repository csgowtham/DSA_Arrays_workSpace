public class leftRotateArray2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        leftRotateArrayElemnets(arr,2);
    }
    public static void leftRotateArrayElemnets(int[] arr, int d){
        d = d % arr.length;
        arr = arrayReverse(arr,0,d-1);
        arr = arrayReverse(arr, d, arr.length-1);
        arr = arrayReverse(arr, 0, arr.length-1);


         //Printing the Array After Left Rotation
         System.out.println("Array After Left Rotation : ");
         for(int nums : arr){
             System.out.print(nums + " ");
         }


        
        
    }

    public static int[] arrayReverse(int arr[],int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
