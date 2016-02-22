package Quatro;

/**
 * Created by John on 2016-02-21.
 */
public class QuatroHumanPlayer extends Player{
    QuatroHumanPlayer(String name, boolean isFirst){
        super();
        initialize(name,isFirst);
    }

    @Override
    public void actionInHisTurn(int nofturn){
        if(nofturn == 1){

        }
        QuatroBoard currentboard = (QuatroBoard)controller.getCurrentBoard();
        AskForImput();
    }
    public void AskForImput(){

    }
}
