public class moveZerosBrute {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,6,5,0};
        moveZerosToRightBrute(arr);
    }

    public static void moveZerosToRightBrute(int arr[]){
        int zeros_count=0;
        //Counting the Numbers of Zeros in the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros_count++;
            }
        }
        System.out.println("Number of Zeros : "+zeros_count);
        if(zeros_count>0){
            int[] temp = new int[arr.length-zeros_count];
            int j=0;
            //Copying non-Zero elements to a temporary Array
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    temp[j]=arr[i];
                    j++;
                }       
                
            }
            /*Copying Non-Zero Elements first to the Given Array From 
            Temporary Array that has a copy of Non-Zero Elements*/
            for(int i=0;i<temp.length;i++){
                arr[i] = temp[i];
            }

            //Then apending the Zeros to the last based on the Zeros_counter
            for(int i=temp.length;i<arr.length;i++){
                arr[i]=0;
            }

            for(int nums : arr){
                System.out.print(nums + " ");
            }
        }
    }
}
