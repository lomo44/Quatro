package Quatro;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by John on 2016-02-21.
 */
public class BoardController {
    private Board currentBoard;
    private Queue<Player> PlayerQueue = new LinkedList<>();
    private int nofturn = 0;

    public Board getCurrentBoard(){
        return currentBoard;
    }
    public int getNofturn(){return nofturn;};
    public void eventLoop(){
        for(;;){
            nofturn++;
            Player currentplayer = PlayerQueue.poll();
            currentplayer.setHisTurn(true);
            currentplayer.actionInHisTurn(nofturn);
            PlayerQueue.add(currentplayer);
        }
    }
    public void addPlayer(Player newplayer){PlayerQueue.add(newplayer);
    }
}
