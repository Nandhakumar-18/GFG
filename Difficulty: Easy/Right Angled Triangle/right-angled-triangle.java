class Solution {
    public boolean rightAngTri(int a, int b, int c) {
        // code here
        if((a * a + b * b == c * c) ||
            (a * a + c * c == b * b) ||
            (c * c + b * b == a * a) )
            return true;
        return false;
    }
}