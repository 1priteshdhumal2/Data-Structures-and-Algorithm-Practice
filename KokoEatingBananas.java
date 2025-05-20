import java.util.*;

    public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }

    static int calculateTotalHrs(int[] arr,int h){
        int totalHrs = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            totalHrs += Math.ceil((double)arr[i] / (double)h);
        }
        // System.out.println(totalHrs);
        return totalHrs;
    }

    static int minimumRateToEatBananas(int arr[], int h){
        int maxEle = maxNumber(arr);
        for(int i = 1; i <= maxEle; i++){
            int reqTime = calculateTotalHrs(arr, i); 
            if (reqTime <= h) {
                return i;
            }
        }
        return maxEle;
    }

    static int maxNumber(int arr[]){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
}
