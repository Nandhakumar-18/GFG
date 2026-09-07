class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<>();
        double discriminant = (double) b * b - 4.0 * a * c;
        if (discriminant < 0) {
            roots.add(-1);
            return roots;
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
        int floorRoot1 = (int) Math.floor(root1);
        int floorRoot2 = (int) Math.floor(root2);
        if (floorRoot1 >= floorRoot2) {
            roots.add(floorRoot1);
            roots.add(floorRoot2);
        } else {
            roots.add(floorRoot2);
            roots.add(floorRoot1);
        }
        return roots;
    }
}