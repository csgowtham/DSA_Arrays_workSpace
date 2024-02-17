public class leftRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        leftRotateArrayElemnets(arr);
    }
    public static void leftRotateArrayElemnets(int[] arr){
        int temp =  arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        
        //Printing the Array After Left Rotation
        System.out.println("Array After Left Rotation : ");
        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
}
