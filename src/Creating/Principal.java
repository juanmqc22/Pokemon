package Creating;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		


		

//		Starting the game saving name and pokemon of players
		Player player1 = new Player();
		Player player2 = new Player();
		System.out.println("Lets play!");
		System.out.println("Player 1, it's your time! ");
		player1.Name = player1.GetName();
		System.out.println("Player 2, it's your time! ");
		player2.Name = player2.GetName();
		System.out.println("Welcome " + player1.Name.toUpperCase() + " and " + player2.Name.toUpperCase() + "!");
		player1.pokemon = player1.GetPokemon(player1.Name);
		player2.pokemon = player2.GetPokemon(player2.Name);
		System.out.println("Lets start!!\n ");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

		// Time for the fight!

		Board board = new Board();
		board.game(player1, player2);
//		Time for the fight! 

		scan.close();

	}

}
