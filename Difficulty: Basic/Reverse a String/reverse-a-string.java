class Solution {
    public static String reverseString(String s) {
        // code here
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}