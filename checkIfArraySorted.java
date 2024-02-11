public class checkIfArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        boolean result = checkIfArrayIsSorted(arr);
        System.out.println("Is Array Sorted ? : "+ result);
    }
    
    public static boolean checkIfArrayIsSorted(int[] arr){
        
        int key=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=key){
                key = arr[i];
            }
            else{
                return false;
            }
        }
        return true;

    }
}
