package Creating;

import java.util.Scanner;

public class Board {

	Pokemon pokemon;

	public void myTime(Pokemon a, Pokemon b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to do?\n" + "1) Attack " + "2) Restore life ");
		int want = sc.nextInt();
		if (want == 1) {
			int atackValue = a.valorAtaque();
			System.out.println("O valor do atack é: " + atackValue);
			b.saude = b.saude - atackValue;
			System.out.println("Vida: " + b.nome + " = " + b.saude);
		} else if (want == 2) {
			int restore = a.restaurarVida();
			System.out.println("O valor do da restauração é: " + restore);
			a.saude = a.saude + restore;
			System.out.println("Vida: " + a.nome + " = " + a.saude);
			
		}
	}

	public void attack() {
		System.out.println("ATTACK!!!!!\n ");

	}
}
