package Quatro;

/**
 * Created by John on 2016-02-21.
 */
public class QuatroBoard extends Board {
    QuatroBoard(){
        super();
        this.initialize(4,4,16);
    }
    private boolean checkRowForSimilarity(int _row){
        _row = (_row - 1)*4;
        return hasSimilarityFor4Piece(board[_row],board[_row+1],board[_row+2],board[_row+3]);
    }
    private boolean checkColForSimilarity(int _col){
        return hasSimilarityFor4Piece(board[_col],board[_col+4],board[_col+8],board[_col+16]);
    }
    private boolean checkDiagnalForSimilarity(){
        return hasSimilarityFor4Piece(board[0],board[5],board[10],board[15]) ||
                hasSimilarityFor4Piece(board[3],board[6],board[9],board[12]);
    }
    public boolean hasSimilarityFor4Piece(int _id1, int _id2, int _id3, int _id4){
        for(int i = 0 ; i < 4; i++){
            if(((_id1 & 1) == 1) && ((_id2 & 1) == 1)&&((_id3 & 1) == 1)&&((_id4 & 1) == 1)){
                return true;
            }
            else{
                _id1 = _id1 >> 1;
                _id2 = _id2 >> 1;
                _id3 = _id3 >> 1;
                _id4 = _id4 >> 1;
            }
        }
        return false;
    }
    public boolean BoardHasSimilarity(){
        for(int i = 0; i < 16; i+=4){
            if(checkColForSimilarity(i)||checkRowForSimilarity(i)){
                return true;
            }
        }
        return checkDiagnalForSimilarity();
    }
    public boolean isMoveValid(int _id, int x, int y){
        if(!isInBound(x,y)){
            return false;
        }
        else if(!hasVacancy(x,y)){
            return false;
        }
        else if(isPieceValid(_id)){
            return false;
        }
        else if(hasPiece(_id)){
            return false;
        }
        else {
            return true;
        }
    }
    public void move(int _id, int x, int y){
        if(isMoveValid(_id,x,y)){
            PieceList[_id] = true;
            board[(y-1)*width + (x-1)] = _id;
        }
    }
    public boolean checkWin(){
        return BoardHasSimilarity();
    }
}
