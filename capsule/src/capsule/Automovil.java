package capsule;

public class Automovil {

	
	public int precio;
	private String marca;
	
	//constructor
	public Automovil(){
		
		System.out.println("Se ha creado el objeto correctamente");
		
	}

	//metodos getter y setter practica
	public int getPrecio(){
		
		return this.precio;
	}
	public String getMarca(){
		return this.marca;
	}
	//metodos set
	public void setPrecio(int p){
		this.precio=p;
	}
	public void setMarca(String m){
		this.marca=m;
	}
}
