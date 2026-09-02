class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0, temp = n;
        while(temp != 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return n == sum;
    }
}