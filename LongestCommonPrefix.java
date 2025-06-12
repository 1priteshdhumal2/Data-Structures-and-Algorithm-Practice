import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = {"flowers" , "flow" , "fly", "flight" };
        int n = str.length;
        Arrays.sort(str);
        
        String First = str[0], Last = str[n - 1];
        int index = 0; 
        String ans = "";

        for(int i = 0; i < Math.min(First.length(), Last.length()); i++){
            if (First.charAt(i) != Last.charAt(i)) {
                break;
            }
            ans += First.charAt(i);
        }
        System.out.println(ans);
        // String prefix = str[0];
        // int stringLength = prefix.length();

        // String longestPrefix = "";
        // for(int i = 1; i < n ; i++){
        //     if (prefix.equals(str[i]) && prefix.length() == str[i].length()) {
        //         longestPrefix = str[i];
        //     }
        //     else{
        //         prefix = prefix.substring(0, stringLength - i);
        //    }
        // }

        // return longestPrefix;
    }
}
