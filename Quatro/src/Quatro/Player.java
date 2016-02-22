package Quatro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by John on 2016-02-21.
 */
public abstract class Player {
    private String playername;
    private boolean isHisTurn;
    protected BoardController controller;
    private BufferedReader inputReader;
    
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
        inputReader = new BufferedReader(new InputStreamReader(System.in));
    }
    public String ReadFromUserInput() throws IOException{
    	return inputReader.readLine();
    }
    public void WriteToConcole(String _line){
    	System.out.println(_line);
    }
    abstract public void actionInHisTurn(int nofturn);
}
