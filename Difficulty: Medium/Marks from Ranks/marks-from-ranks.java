class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        // code here
        ArrayList<Integer> marks = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            for(int j = l[i]; j <= r[i]; j++) marks.add(j);
        }
        for(int i = 0; i < rank.length; i++){
            ans.add(marks.get(rank[i] - 1));
        }
        return ans;
    }
}