import java.util.*;

public class Array_return {
    
    public static void main(String[] args) {
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        obj.close();
        
    }    
        
    
}

