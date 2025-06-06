public class Highest_Occurring_Element_in_an_Array {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;
        int mostFrequent = 0;
        int FrequentElement = 0;

        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j = i; j < n ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

                if(count > mostFrequent){
                    mostFrequent = count;
                    FrequentElement = arr[i];
                }else if(count == mostFrequent && arr[i] < FrequentElement){
                    FrequentElement = arr[i];
                }
            }
        }

        System.out.println("The most frequent element is: " + FrequentElement);
    }
}
