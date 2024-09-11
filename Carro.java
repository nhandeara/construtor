package Construtor;

public class Carro {
	
	private String placa;
	private int chassi;
	
	public Carro(String placa, int chassi) {
		this.placa = placa;
		this.chassi = chassi;
	}
	public  Carro(String placa) {
		this.placa = placa;
	}
	public  Carro(int chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
}

