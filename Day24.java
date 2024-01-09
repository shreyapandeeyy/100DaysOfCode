class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet();
        int a = 0;
        int b = 0;


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int num = grid[i][j];
                if (set.contains(num)) {
                    a = num;
                }
                else {
                    set.add(num);
                }
            }
        }

        for (int i = 1; i <= (int) Math.pow(grid.length, 2); i++) {
            if (! set.contains(i)) {
                b = i;
                break;
            }
        }

        return new int[] {a, b};
    }
}