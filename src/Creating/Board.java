package Creating;

import java.util.Scanner;

public class Board {
	
	Pokemon pokemon;
	
	public int myTime() {
		Scanner sc= new Scanner(System.in);
		System.out.println("What would you like to do?\n"
				+ "1) Attack"
				+ "2) Defense"
				+ "3) Restore life");
		int want = sc.nextInt();
		if (want == 1) {
  //			scan.close();
//			sc.close();
	       	} else if (want == 2) {
			System.out.println(b.nome + " has been chosen!");
//			scan.close();
//			sc.close();
		}
	}
	
	public void attack() {
		System.out.println("ATTACK!!!!!\n ");
		
	}
}
