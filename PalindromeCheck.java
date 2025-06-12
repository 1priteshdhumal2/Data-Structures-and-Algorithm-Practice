public class PalindromeCheck {
    public boolean palindromeCheck(String s) {
        //your code goes here
        int start = 0; 
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeCheck obj = new PalindromeCheck();
        System.out.println(obj.palindromeCheck("malayalam"));
    }  
}
