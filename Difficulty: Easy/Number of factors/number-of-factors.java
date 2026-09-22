class Solution {
    static int countFactors(int n) {
        // code here
        int count = 1;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0) count++;
        }
        return count;
    }
}