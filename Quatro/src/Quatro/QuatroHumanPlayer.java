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
    public void actionInHisTurn(){
        QuatroBoard currentboard = (QuatroBoard)controller.getCurrentBoard();
        AskForImput();
    }
    public void firstMove(){

    }
    public void AskForImput(){

    }
}
