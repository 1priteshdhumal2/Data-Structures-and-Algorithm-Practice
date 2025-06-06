public class LCMofTwoNum {
    public int LCM(int n1, int n2) {
        int lcm;

        int n = Math.max(n1, n2);
        int i = 1;

        while (true) {
            int mul = n * i;
            
            if(mul % n1 == 0 && mul % n2 == 0){
                lcm = mul;
                break;
            }
            i++;
        }

        return lcm;
    }
    public static void main(String[] args) {
        int n1 = 4, n2 = 12;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        // Function call to get LCM of n1 and n2
        int ans = sol.LCM(n1, n2);
        System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + ans);
    }
}
