import java.util.ArrayList;
import java.util.Arrays;
public class CheckPrime {
    public static int checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 1;
            }
            
        }
        return 0;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Number of elements in list : "+arr.size());
        System.out.println(arr);
        for(int i=arr.size()-1;i>=0;i--){
            if(checkPrime(arr.get(i))==0){
                arr.remove(i);
            }
        } 
        System.out.println(arr);
        
    }
}
