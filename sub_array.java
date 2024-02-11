//Java Code to print the Sub Arrays from the given Array
public class sub_array {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        
        System.out.println("Subarrays of the given Array : \n");
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            
        }
    }
}
