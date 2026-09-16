class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        long aSum = 0, uSum = 0, n = arr.length;
        long eSum = (n * (n + 1)) / 2;
        TreeSet<Integer> set = new TreeSet<>();
        for(int x : arr){
            set.add(x);
            aSum += x;
        }
        for(int x : set) uSum += x;
        ArrayList<Integer> l = new ArrayList<>();
        l.add((int)(aSum - uSum));
        l.add((int)(eSum - uSum));
        return l;
    }
}
