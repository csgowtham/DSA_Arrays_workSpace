import java.util.ArrayList;
import java.util.Arrays;

public class RemovEvenARL {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(2,7,8,9));
         // Use addAll to add elements
         System.out.println(list1);
        for(int i=list1.size()-1;i>=0;i--){
            if(list1.get(i)%2==0){
                list1.remove(i);
            }
        } 

        System.out.println(list1);
        
    }
    
}
