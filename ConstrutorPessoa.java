package Construtor;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa jogador1 = new Pessoa("Cr7",40);
		System.out.println("-------JOGADOR-1------");
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		
		//*******************************************
		Pessoa jogador2 = new Pessoa("Messi",36);
		System.out.println("-------JOGADOR-2------");
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		//********************************************
		Pessoa jogador3 = new Pessoa("Neymar");
		System.out.println("-------JOGADOR-3------");
		System.out.println(jogador3.getNome());
		
		//********************************************
		Pessoa jogador4 = new Pessoa(35);
		System.out.println("-------JOGADOR-4------");
		System.out.println(jogador3.getIdade());
	}
}


