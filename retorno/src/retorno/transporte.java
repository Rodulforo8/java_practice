package retorno;

public class transporte {
	
	int precio =0;
	//constructor
	public transporte(int precio){
		
		System.out.println("se creo un objeto de transporte");
		
		this.precio = precio;
		
		
	}
	
	public int precio(){
		this.precio++; 
		return this.precio;
		
	}
	
	

}
