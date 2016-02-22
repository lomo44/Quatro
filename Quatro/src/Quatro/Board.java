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
public abstract class Board {
    protected int width;
    protected int height;
    protected int NumberOfPiece;
    protected int[] board;
    protected boolean[] PieceList;

    abstract public void move(int _id, int x, int y);
    abstract public boolean isMoveValid(int _id, int x, int y);
    abstract public boolean checkWin();
    protected boolean hasPiece(int _id){
        return PieceList[_id-1] == true;
    }
    protected boolean hasVacancy(int _x, int _y){
        return board[(_y-1)*width + (_x -1)] == 0;
    }
    protected boolean isPieceValid(int _id){
        return (_id >= 0 && _id <= NumberOfPiece-1);
    }
    protected boolean isInBound(int _x, int _y){
        return (_x >= 1 && _x <= width) && (_y >= 1 && _y <= width);
    }
    protected void initialize(int _width, int _height, int numberOfPiece){
        width = _width;
        height =_height;
        board = new int[width*height];
        PieceList = new boolean[numberOfPiece];
        NumberOfPiece = numberOfPiece;
    }
}

