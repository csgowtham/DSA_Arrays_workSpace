class largestElementArray{
    public static void main(String[] args) {
        int[] arr = new int[]{133,22,77,3,6,2,88,3,55,2,5,8,3,7,33,244};
        int result = findLargest(arr);
        System.out.println("Largest Element in a array : "+ result);
        
    }

    public static int findLargest(int[] arr){
        int max = arr[0];
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    } 
}