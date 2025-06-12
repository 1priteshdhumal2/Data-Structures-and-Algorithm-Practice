public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int sourceMap[] = new int[256];
        int targetMap[] = new int[256];

        for (int i = 0; i < n; i++) {
            if (sourceMap[s.charAt(i)] != targetMap[t.charAt(i)])
                return false;

            sourceMap[s.charAt(i)] = i + 1;
            targetMap[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
