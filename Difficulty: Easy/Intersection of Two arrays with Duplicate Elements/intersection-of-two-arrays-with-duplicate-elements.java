class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> l = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int n : a) l.add(n);
        for(int x : b){
            if(l.contains(x)) ans.add(x);
        }
        return new ArrayList<>(ans);
    }
}