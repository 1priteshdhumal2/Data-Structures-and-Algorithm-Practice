public class ArmstrongNumber {
    public int countDigit(int n){
        int count = (int) (Math.log10(n) + 1);
        return count;
    }

    public boolean isArmstrong(int n) {
        int count = countDigit(n);
        int sum = 0;
        int copy = n;

        while(n > 0){
            int lastDigit = n % 10;

            sum = sum + (int) Math.pow(lastDigit, count);

            n = n / 10;
        }

        return (sum == copy);
    }

    public static void main(String[] args) {
        int n = 1567;
        
        /* Creating an instance of 
        Solution class */
        ArmstrongNumber sol = new ArmstrongNumber();
        
        /* Function call to find whether the
        given number is Armstrong or not */
        boolean ans = sol.isArmstrong(n);
        
        if (ans) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
