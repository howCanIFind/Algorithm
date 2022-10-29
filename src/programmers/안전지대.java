package programmers;

import java.util.Arrays;

public class 안전지대 {

    public int solution(int[][] board) {
        int answer = 0;



        return answer;
    }

    public void findBoom(int[][] board, int i, int j) {
        int column = board.length;
        int row = board[0].length;

        // row)지뢰 위치가 0보다 크고 길이보다 작을 경우
        // column)지뢰 위치가 0보다 크고 길이보다 작을 경우



        // row)지뢰 위치가 0보다 작고 길이보다 클 경우
        // column)지뢰 위치가 0보다 작고 길이보다 클 경우
    }

    // 다른 사람 풀이
    public int solution2(int[][] board) {
        int answer = 0;
        int boomExplosionRange = 1;
        int[][] copyBoard = new int[board.length][board[0].length];

        int tempIndex = 0;
        for (int[] rows : board) {
            copyBoard[tempIndex] = Arrays.copyOf(rows, board[tempIndex].length);
            tempIndex++;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];

                if(val == 0) continue;

                makeBoomArea(i, j, boomExplosionRange,copyBoard);
            }
        }

        for (int[] ints : copyBoard) {
            for (int anInt : ints) {
                if(anInt == 0)
                    answer++;
            }
        }

        return answer;
    }

    private void makeBoomArea(int row, int col, int boomExplosionRange, int[][] board) {
        for (int r = row - boomExplosionRange; r <= row + boomExplosionRange ; r++) {
            if(r < 0 || r >= board.length) continue;

            for (int c = col - boomExplosionRange; c <= col + boomExplosionRange; c++) {
                if(c < 0 || c >= board[0].length) continue;

                board[r][c] = 1;
            }
        }
    }
}
