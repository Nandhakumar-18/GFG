class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1, second = -1;
        for(int n : arr){
            if(n > largest){
                second = largest;
                largest = n;
            }
            else if(n < largest && n > second) second = n;
        }
        return second;
    }
}