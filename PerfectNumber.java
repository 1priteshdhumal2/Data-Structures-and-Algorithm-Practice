public class PerfectNumber {
    public boolean isPerfect(int n) {
        
        /* Variable to store the sum
        of all proper divisors */
        int sum = 0;
        
        // Loop from 1 to n
        for(int i = 1; i < n; ++i) {
            
            // Check if i is a proper divisor
            if(n % i == 0){
                // Update sum
                sum = sum + i;
            }
        }
        
        // Compare sum and n
        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        
        /* Creating an instance of 
        Solution class */
        PerfectNumber sol = new PerfectNumber(); 
        
        
        boolean ans = sol.isPerfect(n);
        
        if(ans) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
