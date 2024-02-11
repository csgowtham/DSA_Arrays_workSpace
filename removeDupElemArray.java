public class removeDupElemArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3};
        removeDupElementsInArray(arr);
    }

    public static void removeDupElementsInArray(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        System.out.println("Number of Unique Elements : "+(i+1)+"\n");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
