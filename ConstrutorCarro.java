package Construtor;

public class ConstrutorCarro {

	public static void main(String[] args) {
		
			Carro carro1 = new Carro("carrinho",9876);
			
			System.out.println("-------carrinho------");
			System.out.println(carro1.getPlaca());
			System.out.println(carro1.getChassi());
			
			//*******************************************
			Carro carro2 = new Carro(123456);
			System.out.println("-------carro2------");
			System.out.println(carro2.getChassi());
			
			
			//********************************************
			Carro carro3 = new Carro("ca12rro34");
			System.out.println("-------carro------");
			System.out.println(carro3.getPlaca());
			
			
	}

	
}
