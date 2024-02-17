public class rightRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        rightRotateArrayElements(arr,2);
    }
    public static void rightRotateArrayElements(int[] arr,int d){
        d = d % arr.length;
        int[] temp = new int[d];
        int k = arr.length-d;
        for(int i=0;i<d && k<arr.length;i++){
            temp[i]=arr[k];
            k++;           
        }
        
        for(int i=arr.length-1;i>=d;i--){            
                arr[i] = arr[i-d];      
        }
        
        for(int i=0;i<d;i++){
            arr[i] = temp[i];
            
        }


        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
