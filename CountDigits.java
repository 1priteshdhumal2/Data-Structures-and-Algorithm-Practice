public class CountDigits {
    public static void main(String[] args) {
       int N = 329823; 
       int digits = countDigits(N);
       System.out.println("Number of digits in N: " + digits);
    }

    public static int countDigits(int n) {
        int cnt = 0;
        
        while( n > 0) {
            cnt = cnt + 1;
            System.out.println(cnt);
            n = n / 10;
            System.out.println(n);
        }
        return cnt;
    }
}
