package Sobrecarga;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		
		// Mesmo metodo se comportando diferente.
		
		dog.reagir("Ola");
		dog.reagir("Vai apanhar");
		dog.reagir(false); // O cão reagi de forma diferente para pessoas diferentes. 
		
	}

}
