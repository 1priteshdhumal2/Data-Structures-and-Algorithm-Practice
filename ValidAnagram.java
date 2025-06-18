public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        int source[] = new int[256];

        for(int i = 0; i < s.length(); i++){
            source[s.charAt(i)]++;
        }

        for(int j = 0; j < t.length(); j++){
            if(source[t.charAt(j)] == 0){
                System.out.println("false");
            }
        }
        
    }
}
