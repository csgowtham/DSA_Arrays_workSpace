public class rev_Vowels_in_String {
    public static void main(String[] args) {
        String str="WelcomeToScaler";
        String result = reverseVowelsInString(str);
        System.out.println(result);

    }
    public static String reverseVowelsInString(String str){
        int i=0,j=str.length()-1;
        char[] charr = str.toCharArray();
        while(i<=j){
            if((isVowel(charr[i])) && (isVowel(charr[j]))) {
                char temp = charr[i];
                charr[i] = charr[j];
                charr[j]=temp;
                i++;
                j--;

            }
            else if(isVowel(charr[i])){
                j--;
            }
            else if(isVowel(charr[j])){
                i++;
            }
            else{
                i++;j--;
            }
            
        }
        return new String(charr);
       
        
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}
