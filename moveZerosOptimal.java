public class moveZerosOptimal {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,6,5,0};
        moveZerosToRightOptimal(arr);
    }
    public static void moveZerosToRightOptimal(int[] arr){
        int j = -1;
        //Moving to the index in 0's First Occurence
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        System.out.println("Value of j inti  : "+j);
    
        if(j!=-1){ //Checking if There is Zeros in the given array

            /*By two pointer approach, The j initially points to First 0
            i initally points to j+1;
            Then the elements are swapped based on the condition 
            */
        
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]!=0){
                    arr = swap(arr, i, j);
                    j++;
                }
                
            }
        }
        

        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}


