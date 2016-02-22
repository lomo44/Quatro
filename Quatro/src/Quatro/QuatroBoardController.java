package Quatro;

/**
 * Created by John on 2016-02-21.
 */
public class QuatroBoardController extends BoardController {

    private int FloatingPiece;
    public void setFloatingPiece(int _piece){
        FloatingPiece = _piece;
    }
    public int getFloatingPiece(){
        return FloatingPiece;
    }
    public void addHumanPlayer(String name, boolean first){
        super.addPlayer(new QuatroHumanPlayer(name,first));
    }
}
