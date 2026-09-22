class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {
        // code here.
        int product = 1;
        for(int n : arr) product *= n;
        return (product % 2 == 0) ? true : false; 
    }
}