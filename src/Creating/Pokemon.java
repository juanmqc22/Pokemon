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

	public int valorAtaque() {
		Random rand = new Random();
		int upperbound = 100;
		int ataques = rand.nextInt(upperbound);
		return ataques;
	}
	public int valorDefesa(int def) {
		Random rand = new Random();
		int upperbound = def;
		int defesa = rand.nextInt(upperbound);
		return defesa;
	}
	public int restaurarVida() {
		Random rand = new Random();
		int upperbound = 80;
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
