class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            HashSet seenRow = new HashSet();
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                if (seenRow.contains(board[r][c])) return false;
                seenRow.add(board[r][c]);
            }
        }
        for (int c = 0; c < 9; c++) {  
            HashSet seenCol = new HashSet();
            for (int r = 0; r < 9; r++) {
                if (board[r][c] == '.') continue;
                if (seenCol.contains(board[r][c])) return false;
                seenCol.add(board[r][c]);
            }
        }
        for (int s = 0; s < 9; s++) {
            HashSet seenSqe = new HashSet();
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    int realRow = s / 3 * 3 + r;
                    int realC = s % 3 * 3 + c;
                    if (board[realRow][realC] == '.') continue;
                    if (seenSqe.contains(board[realRow][realC])) return false;
                    seenSqe.add(board[realRow][realC]);
                }
            }
        }
        return true;
    }
}