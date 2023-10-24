class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        int[][] ans = new int[C][R];
        for (int row = 0; row < R; ++row)
            for (int col = 0; col < C; ++col) {
                ans[col][row] = matrix[row][col];
            }
        return ans;
    }
}