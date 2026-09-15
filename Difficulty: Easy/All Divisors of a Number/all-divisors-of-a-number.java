class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0) {
                al.add(i);
                if(i != n/i) al.add(n/i);
            }
        }
        Collections.sort(al);
        return al;
    }
}