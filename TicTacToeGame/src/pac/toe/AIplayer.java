package pac.toe;

import java.util.Random;
import java.util.Scanner;

public class AIplayer extends player {
	String name;
	char mark;

	public AIplayer(String name,char mark){
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
		Random r=new Random();
		   row=r.nextInt(3);
		   column=r.nextInt(3);
		}while(!isValidMove(row,column));
	    
		TicTacToe.placeMark(row, column, mark);
	}



}
