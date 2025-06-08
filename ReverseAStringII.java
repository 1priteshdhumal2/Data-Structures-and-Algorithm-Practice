public class ReverseAStringII {
    public static void main(String[] args) {
        String s[] = {"h", "e", "l", "l", "o"};

        String revArr[] = new String[s.length];

        for(int i = 0; i < s.length; i++){
            revArr[i] = s[s.length - i - 1];
        }

        for(int i = 0; i < revArr.length; i++){
            s[i] = revArr[i];
        }

        // for(int i = 0; i < s.length; i++){
        //     System.out.println(s[i]);
        // }`

        // for(int j = s.length - 1; j >= 0; j--){
        //     System.out.println(s[j]);
        // }

        // for(int i = 0; i < s.length; i++){
        //     for(int j = s.length - 1; j > 0; j--){
        //         if(i == j) break;
        //         String temp = s[i];
        //         s[i] = s[j];
        //         s[j] = temp;
        //     }
        // }

        for(int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
    }
}
