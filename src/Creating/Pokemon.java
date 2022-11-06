package Creating;

import java.util.Random;

public class Pokemon {
	Integer numero;
	String nome;
	Integer ataque;
	Integer defesa;
	Integer saude;
	Integer ataqueEspecial;
	Integer defesaEspecial;
	Integer velocidade;
	String genero;
	String golpe1;
	String golpe2;
	String golpe3;
	int mana1;
	int mana2;
	int mana3;

	public int valorAtaque(int ataque) {
		Random rand = new Random();
		int upperbound = ataque;
		int ataques = rand.nextInt(upperbound);
		return ataques;
	}
	
	public Pokemon charmander() {
		Pokemon charmander = new Pokemon();
		charmander.nome = "Charmander";
		charmander.defesa = charmander.valorDefesa(50);
		charmander.saude = 1000;
		charmander.defesaEspecial = charmander.valorDefesa(250);
		charmander.golpe1 = "Mordida";
		charmander.mana1 =  1;
		charmander.golpe2 = "Lança chamas";
		charmander.mana2 =  2;
		charmander.golpe3 = "Chuva de fogo";
		charmander.mana3 =  3;
		return charmander;
	}
	public Pokemon bulbasaur () {
		Pokemon bulbasaur = new Pokemon();
		bulbasaur.nome = "Bulbasaur ";
		bulbasaur.defesa = bulbasaur.valorDefesa(50);
		bulbasaur.saude = 1000;
		bulbasaur.defesaEspecial = bulbasaur.valorDefesa(250);
		bulbasaur.golpe1 = "Vento de folhas";
		bulbasaur.golpe2 = "Dia soleado";
		bulbasaur.golpe3 = "Raio solar";
		bulbasaur.mana1 =  1;
		bulbasaur.mana2 =  2;
		bulbasaur.mana3 =  3;

		return bulbasaur;
	}
	public Pokemon squirtle() {
		Pokemon squirtle = new Pokemon();
		squirtle.nome = "Squirtle ";
		squirtle.defesa = squirtle.valorDefesa(50);
		squirtle.saude = 1000;
		squirtle.defesaEspecial = squirtle.valorDefesa(250);
		squirtle.golpe1 = "Pistola de agua ";
		squirtle.golpe2 = "Mordida";
		squirtle.golpe3 = "Surf";
		squirtle.mana1 =  1;
		squirtle.mana2 =  2;
		squirtle.mana3 =  3;
		return squirtle;
	}
	
	
	
	public int valorDefesa(int def) {
		Random rand = new Random();
		int upperbound = def;
		int defesa = rand.nextInt(upperbound);
		return defesa;
	}
	public int restaurarVida() {
		Random rand = new Random();
		int upperbound = 500;
		int vida = rand.nextInt(upperbound);
		return vida;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAtaque() {
		return ataque;
	}
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}
	public Integer getDefesa() {
		return defesa;
	}
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	public Integer getSaude() {
		return saude;
	}
	public void setSaude(Integer saude) {
		this.saude = saude;
	}
	public Integer getAtaqueEspecial() {
		return ataqueEspecial;
	}
	public void setAtaqueEspecial(Integer ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}
	public Integer getDefesaEspecial() {
		return defesaEspecial;
	}
	public void setDefesaEspecial(Integer defesaEspecial) {
		this.defesaEspecial = defesaEspecial;
	}
	public Integer getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGolpe1() {
		return golpe1;
	}
	public void setGolpe1(String golpe1) {
		this.golpe1 = golpe1;
	}
	public String getGolpe2() {
		return golpe2;
	}
	public void setGolpe2(String golpe2) {
		this.golpe2 = golpe2;
	}
	public String getGolpe3() {
		return golpe3;
	}
	public void setGolpe3(String golpe3) {
		this.golpe3 = golpe3;
	}
	@Override
	public String toString() {
		return "Pokemon numero=" + numero + ", nome=" + nome + ", ataque=" + ataque + ", defesa=" + defesa + ", saude="
				+ saude + ", ataqueEspecial=" + ataqueEspecial + ", defesaEspecial=" + defesaEspecial + ", velocidade="
				+ velocidade + ", genero=" + genero + ", golpe1=" + golpe1 + ", golpe2=" + golpe2 + ", golpe3=" + golpe3
	;
	}
	
}
