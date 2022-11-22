public class PalindromeString {
    public static void main(String[] args) {

    }

    int isPalindrome(String S) {
        return helper(S,0,S.length()-1);
    }

    int helper(String str,int start,int end){
        if(str.charAt(start)!=str.charAt(end)){
            return 0;
        }

        if (end>start){
            return helper(str,start+1,end-1);
        }
        return 1;
    }
}
