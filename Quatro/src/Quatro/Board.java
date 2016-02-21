/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quatro;

/**
 *
 * @author lizhuan1
 */
public class Board {
    private final int width = 4;
    private final int height = 4;
    private int[] board;
    private boolean[] hasPiece;
    
    Board(){
        board = new int[16];
        hasPiece = new boolean[16];
    }
    
    public void move(int _id, int x, int y){
        if(isMoveValid(_id,x,y)){
            hasPiece[_id] = true;
            board[(y-1)*width + (x-1)] = _id;
        }
    }
    private boolean isMoveValid(int _id, int x, int y){
        if(!isInBound(x,y)){
            return false;
        }
        else if(!hasVacancy(x,y)){
            return false;
        }
        else if(hasPiece(_id)){
            return false;
        }
        else
            return true;
    }
    private boolean hasPiece(int _id){
        return hasPiece[_id-1] == true; 
    }
    private boolean hasVacancy(int _x, int _y){
        return board[(_y-1)*width + (_x -1)] == 0;
    }
    private boolean isPieceValid(int _id){
        return (_id >= 0 && _id <= 15);
    }
    private boolean isInBound(int _x, int _y){
        return (_x >= 1 && _x <= 4) && (_y >= 1 && _y <= 4);
    }
    private boolean hasSimilarity(int _id1, int _id2, int _id3, int _id4){
        for(int i = 0 ; i < 4; i++){
            if((_id1 & 1) == 0b1){
        }
    }
}
