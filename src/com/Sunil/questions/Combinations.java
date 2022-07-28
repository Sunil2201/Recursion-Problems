package com.Sunil.questions;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(solve(board, visited, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve(char[][] board, boolean[][] visited, String word, int index, int row, int col){
        if(index == word.length()){
            return true;
        }

        if(row<0 || row>=board.length || col<0 || col>=board[0].length){
            return false;
        }
        if(board[row][col] != word.charAt(index) || visited[row][col] == true){
            return false;
        }

        visited[row][col] = true;

        if(solve(board,visited,word,index+1,row+1,col)||
                solve(board,visited,word,index+1,row-1,col)||
                solve(board,visited,word,index+1,row,col+1)||
                solve(board,visited,word,index+1,row,col-1)){
            return true;
        }

        visited[row][col]=false;
        return false;
    }
}

