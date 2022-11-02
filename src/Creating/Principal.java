package Creating;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// Creating the pokemons with their characteristics.
		
// BULBASAUR		
		Pokemon bulbasaur = new Pokemon();
		bulbasaur.numero = 1;
		bulbasaur.nome = "Bulbasaur";
		bulbasaur.defesa = bulbasaur.valorDefesa(50);
		bulbasaur.ataque = bulbasaur.valorAtaque(100);
		bulbasaur.saude = 500;
		bulbasaur.ataqueEspecial = bulbasaur.valorAtaque(250);
		bulbasaur.defesaEspecial = bulbasaur.valorDefesa(250);
		bulbasaur.golpe1 = "Chuva de folhas";
		bulbasaur.golpe2 = "Chicote";
		bulbasaur.golpe3 = "Raio solar";
//CHARMANDER
		Pokemon charmander = new Pokemon();
		charmander.numero = 1;
		charmander.nome = "Charmander";
		charmander.defesa = charmander.valorDefesa(50);
		charmander.ataque = charmander.valorAtaque(100);
		charmander.saude = 500;
		charmander.ataqueEspecial = charmander.valorAtaque(250);
		charmander.defesaEspecial = charmander.valorDefesa(250);
		charmander.golpe1 = "Chuva de fogo";
		charmander.golpe2 = "Lança chamas";
		charmander.golpe3 = "Mordida";
//SQUIRTLE
		Pokemon squirtle = new Pokemon();
		squirtle.numero = 1;
		squirtle.nome = "Squirtle";
		squirtle.defesa = squirtle.valorDefesa(50);
		squirtle.ataque = squirtle.valorAtaque(100);
		squirtle.saude = 500;
		squirtle.ataqueEspecial = squirtle.valorAtaque(250);
		squirtle.defesaEspecial = squirtle.valorDefesa(250);
		squirtle.golpe1 = "Chuva ";
		squirtle.golpe2 = "Surf ";
		squirtle.golpe3 = "Pistola de agua";
		
		


		Pokemon kakuna = new Pokemon();
		kakuna.numero = 14;
		kakuna.nome = "Kakuna";
		kakuna.defesa = 9;
		kakuna.ataque = 9;
		kakuna.ataqueEspecial = 9;
		kakuna.defesaEspecial = 9;
		kakuna.genero = "F";
		kakuna.saude = 8;
		kakuna.velocidade = 9;

		System.out.print(kakuna.nome +kakuna.genero);
		
		
		Lendario mewtwo = new Lendario();
		mewtwo.numero = 150;
		mewtwo.nome = "Mewtwo";
		mewtwo.defesa = 9;
		mewtwo.ataque = 9;
		mewtwo.ataqueEspecial = 10;
		mewtwo.defesaEspecial = 10;
		mewtwo.saude = 10;
		mewtwo.genero = "M";
		mewtwo.velocidade = 10;
		mewtwo.habilidadeExtra = "Habilidade Extra";
		
		System.out.println("O pokemon Ã©: "+mewtwo.nome);
		
		mewtwo.restaurarVida();

		int ataquepow = bulbasaur.valorAtaque(100);
		
		String all = bulbasaur.toString();
		System.out.println(all);


		
//		Starting the game saving name and pokemon of players
		Player player1 = new Player();
		Player player2 = new Player();		
		System.out.println("Lets play!");
		System.out.println("Player 1, it's your time! ");
		player1.Name = player1.GetName();
		System.out.println("Player 2, it's your time! ");
		player2.Name = player2.GetName();
		System.out.println("Welcome "+ player1.Name.toUpperCase() + " and " + player2.Name.toUpperCase() + "!");
		player1.pokemon = player1.GetPokemon(bulbasaur, charmander, squirtle, player1.Name);
		player2.pokemon = player2.GetPokemon(bulbasaur, charmander, squirtle, player2.Name);
		System.out.println("Lets start!!\n ");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
		
//		Time for the fight! 
		
		scan.close();
		
	}

}



