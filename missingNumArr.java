import java.util.Arrays;

public class missingNumArr {
    
    public static void main(String[] args) {
        
        boolean index = ispar("{([]}");
        System.out.println(index);


    }
    static boolean ispar(String x)
    {
        // add your code here
        
        int i=0, j=x.length()-1;
        while(i<=j){
            if((x.charAt(i)=='{'&& x.charAt(j)=='}') ||
            (x.charAt(i)=='('&& x.charAt(j)==')') ||
            (x.charAt(i)=='['&& x.charAt(j)==']')
            )
            
            {
                i++;
                j--;
                
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
