package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String color){
		
		if (color== "rojo" || color=="verde" || color=="amarillo" || color=="blanco" || color=="negro") {
			this.color=color;
		}
	}
	
	public String toString() {
		
		return "Esto es una prueba";
		
	}
	
	
	
}
