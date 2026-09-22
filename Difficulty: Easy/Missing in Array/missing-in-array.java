class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1, expectedSum = (n * (n + 1)) / 2, actualSum = 0;
        for(int i = 0; i < arr.length; i++) actualSum += arr[i];
        return (int)(expectedSum - actualSum);
    }
}