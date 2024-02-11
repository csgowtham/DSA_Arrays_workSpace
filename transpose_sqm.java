//Java Code to Perform Matrix Transpose Operation Inplace (Square Matrix) 
public class transpose_sqm {
    public static void main(String[] args) {
        int arr[][]={{4,2,2,4,},
                        {6,9,2,4},
                    {5,5,7,9},
                    {2,2,3,4}};
        int temp=0;
        //Printing the Array 
        System.out.println("Array before Transpose : \n");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Transpose opearation is performed here
        //Only the left bottom traingle of the diagonal is Considered and Swapping opeartion is Done
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //Printing the array after Trasnpose Operation
        System.out.println("Array after Transpose : \n");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
