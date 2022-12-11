package Creating;

import java.util.Scanner;

public class Board {

	Pokemon pokemon;

	public void myTime(Player player, Pokemon a, Pokemon b) {
		Scanner sc = new Scanner(System.in);
		if (player.mana.mana <= 0) {
			System.out.println(player.Name.toUpperCase() + " What would you like to do?\n" + "2) Restore life ");
		}else {
			System.out.println(player.Name.toUpperCase() + " What would you like to do?\n" + "1) Attack " + "2) Restore life ");
		}
		int want = sc.nextInt();
		if (want == 1) {
			System.out.println(player.Name.toUpperCase() + " Escolhe um ataque!\n " +" 1) "+ a.golpe1 + " 2) "+ a.golpe2 + " 3) " + a.golpe3 );
			String nameAtack = "";
			int ataque = sc.nextInt();
			int atackValue = 0;
			if (ataque == 1) {
				atackValue = a.valorAtaque(100);
				nameAtack = a.golpe1;
				player.mana.mana =  player.mana.mana - a.mana1;
			} else if (ataque == 2){
				atackValue = a.valorAtaque(200);
				nameAtack = a.golpe2;
				player.mana.mana =  player.mana.mana - a.mana2;
			} else if (ataque == 3){
				atackValue = a.valorAtaque(300);
				nameAtack = a.golpe3;
				player.mana.mana =  player.mana.mana - a.mana3;

			}
			System.out.println(a.nome + " atacou com "+ nameAtack +" O dano foi de: " + atackValue);
			b.saude = b.saude - atackValue;
			System.out.println("A vida de " + b.nome + " = " + b.saude);
		} else if (want == 2) {
			int restore = a.restaurarVida();
			System.out.println("O valor do da restauração é: " + restore);
			a.saude = a.saude + restore;
			System.out.println("A vida de" + a.nome + " = " + a.saude);

		}

	}

	public boolean isPlaying(Player a, Player b) {
		boolean isPlaying = false;
		if (a.pokemon.saude <= 0 || b.pokemon.saude <= 0) {
		    isPlaying = true;
			return isPlaying;
		} else {
			return isPlaying;
		}
	}

	public void game(Player a, Player b) {
		Pokemon g = a.pokemon;
		Pokemon f = b.pokemon;
		a.mana = a.getMana();
		b.mana = b.getMana();
		
		while (isPlaying(a, b) == false) {
			
			a.mana = a.sumarMana();
			b.mana = b.sumarMana();
			myTime(a, g, f);
			myTime(b, f, g);
			System.out.println(a.mana.mana);
			System.out.println(b.mana.mana);

		}
		System.out.println("End of the game");
	}

}