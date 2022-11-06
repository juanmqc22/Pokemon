package Creating;

import java.util.Scanner;

public class Player {
	String Name;
	Pokemon pokemon; 
	Mana mana;
	
	
	public String GetName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name! ");
		String player = scan.next();
		return player;
	}
	
	public Pokemon GetPokemon(String n) {
		Pokemon poke = new Pokemon();
		
		Scanner sc= new Scanner(System.in);
		System.out.println( n.toUpperCase() + " please choose your POKEMON!\n"
				+ "1) Bulbasaur  "
				+ "2) Charmander "
				+ "3) Squirtle ");
		int pokemonNumber = sc.nextInt();
		if (pokemonNumber == 1) {
			Pokemon pokemon = poke.bulbasaur();

			System.out.println(pokemon.nome + " has been chosen!");
//			scan.close();
//			sc.close();
			return pokemon;
		} else if (pokemonNumber == 2) {
			Pokemon pokemon = poke.charmander();

			System.out.println(pokemon.nome + " has been chosen!");
//			scan.close();
//			sc.close();
			return pokemon;
		} else if (pokemonNumber == 3) {
			Pokemon pokemon = poke.squirtle();

			System.out.println(pokemon.nome + " has been chosen!");
//			scan.close();
//			sc.close();
			return pokemon;
		} else {
			System.out.println("Please try again! ");
		}
		sc.close();
		return pokemon;
	}
	
	
	public Mana sumarMana () {
		mana.mana = mana.mana + 1;
		return mana;
	}
	
	public void restarMana (int mana) {
		mana = mana - 1;
	}
	public Mana getMana () {
		Mana mana = new Mana();
		mana.mana = 0;
		return mana;
	}
	
	
}
