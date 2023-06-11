package pac.toe;

  abstract class player{

	  String name;
	  char mark;
		abstract void makeMove();

public boolean isValidMove(int row,int column)
{
	if(row>=0&&row<=2&&column>=0&&column<=2)
	{
		if(TicTacToe.board[row][column]==' ')
		{
			return true;
		}
	}
	return false;
}
	
}


public class MainRunner {
public static void main(String[] args) {
	TicTacToe t=new TicTacToe();
	
	HumenPlayer p1=new HumenPlayer("Amresh",'X');
//	HumenPlayer p2=new HumenPlayer("Satyam",'O');
	
	AIplayer p2=new AIplayer("TAI",'O');
	
	  player cp=p1;
	  
	while(true)
	{
		  
		  System.out.println(cp.name+" turn");
		  cp.makeMove();
		  
		  TicTacToe.displyboard();
		  
		  if(TicTacToe.cheakcolumnWin()||TicTacToe.cheakRowWin()||TicTacToe.cheakDigoWin())
		  {
			  System.out.println(cp.name+" has won");
			  break;
		  }
		  else if(TicTacToe.cheakRowWin())
		  {
			  System.out.println("Game is Draw");
		  }
		  else {
			  
			  if(cp==p1)
			  {
				 cp=p2; 
			  }
			  else {
				  cp=p1;
			  }
		  }
	}
}

}
