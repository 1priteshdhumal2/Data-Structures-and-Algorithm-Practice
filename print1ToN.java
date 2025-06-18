public class print1ToN {
    static void print1ToNum(int i, int n){
        if (i > n) {
            return;
        }
        System.out.println(i);
        print1ToNum(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;

        print1ToNum(1, n);
    }
}
