package Creating;

import java.util.Scanner;

public class Player {
	String Name;
	Pokemon pokemon; 
	
	
	public String GetName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name! ");
		String player = scan.next();
		return player;
	}
	
	public Pokemon GetPokemon(Pokemon a, Pokemon b, Pokemon c, String n) {
		Scanner sc= new Scanner(System.in);
		System.out.println( n.toUpperCase() + " please choose your POKEMON!\n"
				+ "1) Bulbasaur  "
				+ "2) Charmander "
				+ "3) Squirtle ");
		int pokemonNumber = sc.nextInt();
		if (pokemonNumber == 1) {
			Pokemon pokemon = a;
			System.out.println(a.nome + " has been chosen!");
//			scan.close();
//			sc.close();
			return pokemon;
		} else if (pokemonNumber == 2) {
			Pokemon pokemon = b;
			System.out.println(b.nome + " has been chosen!");
//			scan.close();
//			sc.close();
			return pokemon;
		} else if (pokemonNumber == 3) {
			Pokemon pokemon = c;
			System.out.println(c.nome + " has been chosen!");
//			scan.close();
//			sc.close();
			return pokemon;			
		} else {
			System.out.println("Please try again! ");
		}
		sc.close();
		return pokemon;
		

	}
}
