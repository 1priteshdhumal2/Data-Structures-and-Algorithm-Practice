public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "bcdea";
    
        for(int i = 0 ; i < s.length(); i++){
            // System.out.println(s.substring(i));
            // System.out.println(s.substring(0, i));
            String ans = s.substring(i) + s.substring(0, i);
            System.out.println(ans);
            if(ans.equals(goal)){
                System.out.println(true);
                break;
            }
            else{
                System.out.println(false);
            }
        }
    }

}
