class Solution {
    static boolean isPerfect(int n) {
        // code here
        int factorSum = 1;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) {
                factorSum += i;
                if (i * i != n) factorSum += n / i;
            }
        }
        return factorSum == n;
    }
}