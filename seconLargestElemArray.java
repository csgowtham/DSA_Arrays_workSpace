//import java.util.Pair; 
class seconLargestElemArray{
    public static void main(String[] args) {
        int[] arr = new int[]{133,22,77,3,6,2,88,3,55,2,5,8,3,7,33,244};
        int result[] = findSecondLargest(arr);
        System.out.println("First Largest Element in a array : "+ result[0]);
        System.out.println("Second Largest Element in a array : "+ result[1]); 
        
    }

    public static int[] findSecondLargest(int[] arr){
        int fLarge = arr[0];
        int sLArge = Integer.MIN_VALUE;
        int n =arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>fLarge){
                sLArge = fLarge;
                fLarge = arr[i];
            }
            if(arr[i]<fLarge && arr[i]>sLArge){
                sLArge = arr[i];
            }
        }
        return new int[]{fLarge,sLArge};
    } 
}