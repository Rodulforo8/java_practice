package retorno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		transporte carro = new transporte(5000);
		
		int valor = 0;
		
		valor = carro.precio();
		
		
		System.out.println("la funcion devolvio el valor: "+valor);
		
	}

}
