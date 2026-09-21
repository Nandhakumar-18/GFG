class Solution {
    public int convertFive(int n) {
        // code here
        String s = String.valueOf(n).replaceAll("0","5");
        return Integer.parseInt(s);
    }
}