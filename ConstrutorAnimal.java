package Construtor;

public class ConstrutorAnimal {
	public static void main(String[] args) {
		
		Animal Animal1 = new Animal("caramelo",9);
		
		System.out.println("-------Animal1------");
		System.out.println(Animal1.getCor());
		System.out.println(Animal1.getTamanho());
		
		//*******************************************
		Animal Animal2 = new Animal("preto");
		System.out.println("-------Animal2------");
		System.out.println(Animal2.getCor());
		
		//********************************************
		Animal animal3 = new Animal(8);
		System.out.println("-------Animal3------");
		System.out.println(animal3.getTamanho());
		
}


}