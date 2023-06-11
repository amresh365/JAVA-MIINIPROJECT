package pac.toe;

import java.util.Scanner;

public class HumenPlayer extends player {

	
public HumenPlayer(String name,char mark){
	this.mark=mark;
	this.name=name;
}

public void makeMove()
{
	int row ;
	int column;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter The Row And Column");
	do
	{
	 row =scan.nextInt();
	 column=scan.nextInt();
	}while(!isValidMove(row,column));
    
	TicTacToe.placeMark(row, column, mark);
}


	
}
