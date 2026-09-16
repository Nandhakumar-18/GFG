class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        if (arr.size() < 3) return -1;
        int first = -1;
        int second = -1;
        int third = -1;
        for (int n : arr) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }
        return third;
    }
}