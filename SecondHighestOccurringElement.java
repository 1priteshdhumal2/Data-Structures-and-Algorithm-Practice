import java.util.*;

public class SecondHighestOccurringElement {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};
        
        /* Creating an instance of 
        Solution class */
        SecondHighestOccurringElement sol = new SecondHighestOccurringElement();
        
        /* Function call to get the second
        highest occurring element in array */
        int ans = sol.secondMostFrequentElement(nums);
        
        System.out.println("The second highest occurring element in the array is: " + ans);
    }

    public int secondMostFrequentElement(int nums[]){
        int n = nums.length;
        int max = -1;

        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
        }

        int hash[] = new int[max + 1];

        for(int i = 0; i < n; i++){
            hash[nums[i]]++;
        }

        int mostFrequentEle = -1, mostFrequency = -1, secondMostFrequentEle = -1, secondMostFrequency = -1;

        for(int i = 0; i < hash.length; i++){
            if(hash[i] > mostFrequency){
                secondMostFrequency = mostFrequency; 
                secondMostFrequentEle = mostFrequentEle;
                mostFrequency = hash[i];
                mostFrequentEle = i;
            }
            else if(hash[i] == mostFrequency){
                mostFrequentEle = Math.min(mostFrequentEle, i);
            }else if(hash[i] > secondMostFrequency){
                secondMostFrequency = hash[i];
                secondMostFrequentEle = i;
            }else if(hash[i] == secondMostFrequency){
                secondMostFrequentEle = Math.min(secondMostFrequentEle, i);
            }
        }

        return secondMostFrequentEle; 
    }
}
