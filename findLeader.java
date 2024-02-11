import java.util.*;
public class findLeader {
    public static void main(String[] args) {
        int arr[] = new int[]{16,17,4,3,5,2}; //17,5,2
        calculateLeader(arr);        
    }
    public static void calculateLeader(int[] arr){
        int left=0;
        int right=left+1;
        ArrayList<Integer> res = new ArrayList<>();
        while(left<right){
            if(left<arr.length && right<arr.length){
                if(arr[left]<arr[right]){
                left++;
                right++;
                }
                
            }
            else{
                if(right<arr.length)
                    right++;
                if(right==arr.length-1){
                    res.add(left);
                    left = left+1;
                    right = left+1;
                }                
            }
        }
        System.out.println(res);
    }
}
