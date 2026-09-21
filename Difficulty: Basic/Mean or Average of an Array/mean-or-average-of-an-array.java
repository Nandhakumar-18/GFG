class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0;
        for(int n : arr) sum += n;
        return (int) (sum/arr.length);
    }
}