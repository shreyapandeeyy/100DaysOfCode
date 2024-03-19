class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int r = 0;
        for(int i = 0; i < n; i++){
            sortdia(mat, 0, i, m, n);
        }
        for(int i = 1; i < m; i++){
            sortdia(mat, i, 0, m , n);
        }
        return mat;
    }
    public void sortdia(int[][] mat, int row, int col, int m, int n){
        ArrayList<Integer> al = new ArrayList<>();
        int temp = 0;
        int r = row;
        int c = col;
        while(r < m && c < n){
            al.add(mat[r][c]);
            r++;
            c++;
        }
        r = row;
        c = col;
        Collections.sort(al);
        while(r < m && c < n){
            mat[r][c] = al.get(temp++);
            r++;
            c++;
        }
    }
}