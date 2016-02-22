package Quatro;

import java.io.BufferedReader;


/**
 * Created by John on 2016-02-21.
 */
public class QuatroHumanPlayer extends Player{
	private boolean[] ValidPieceAtHand;
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
    public void AskForGivingPiece(){
    	WriteToConcole("Please hand in the giving piece");
    	
    }
    public void updatePieceAtHand(){
    	ValidPieceAtHand = controller.getCurrentBoard().getValidPieceList();
    }
    public void printValidPiece(){
    	for(int i = 0 ; i < 16; i++){
    		if(ValidPieceAtHand[i]==true){
    			
    		}
    	}
    }
    public void printPiece(int _id){
    	if((_id & 0b1) == 1){
    		System.out.print("Black ");
    	}
    	else{
    		System.out.print("White ");
    	}
    	
    	if((_id & 0b11 )== 0b11){
    		System.out.print("Round ");
    	}
    	else{
    		System.out.print("Square ");
    	}
    	
    	if((_id & 0b111) == 0b111){
    		System.out.print("Shallow ");
    	}
    	else{
    		System.out.print("Readl ");
    	}
    	
    	//TODO
    	
    }

}
