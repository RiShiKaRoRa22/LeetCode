class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagic(grid, i, j)) count++;
            }
        }

        return count;
    }

    private boolean isMagic(int[][] g, int r, int c) {
        boolean[] seen = new boolean[10]; // numbers 1-9

        // Check numbers 1-9
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int val = g[r + i][c + j];
                if (val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }

        // Check rows, cols, diagonals sum = 15
        for (int i = 0; i < 3; i++) {
            if (g[r + i][c] + g[r + i][c + 1] + g[r + i][c + 2] != 15) return false;
            if (g[r][c + i] + g[r + 1][c + i] + g[r + 2][c + i] != 15) return false;
        }

        if (g[r][c] + g[r + 1][c + 1] + g[r + 2][c + 2] != 15) return false;
        if (g[r][c + 2] + g[r + 1][c + 1] + g[r + 2][c] != 15) return false;

        return true;
    }
}
