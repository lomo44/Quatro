package Quatro;

/**
 * Created by John on 2016-02-21.
 */
public abstract class Player {
    private String playername;
    private boolean isHisTurn;
    protected BoardController controller;

    public void setPlayername(String _name){
        playername = _name;
    }
    public void setHisTurn(boolean _first){
        isHisTurn = _first;
    }
    public String getPlayername(){
        return playername;
    }
    public boolean isHisTurn(){
        return isHisTurn;
    }
    public void initialize(String _name, boolean isHisTurn){
        setPlayername(_name);
        setHisTurn(isHisTurn);
    }
    abstract public void actionInHisTurn(int nofturn);
}
