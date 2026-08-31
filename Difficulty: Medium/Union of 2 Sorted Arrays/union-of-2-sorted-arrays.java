class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> unions = new TreeSet<>();
        for(int n : a) unions.add(n);
        for(int x : b) unions.add(x);
        return new ArrayList<>(unions);
    }
}
