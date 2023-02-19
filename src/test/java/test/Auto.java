package test;

public class Auto {

	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	static public int cantidadCreados;
	
	
	
	public int cantidadAsientos() {
		
	    if (asientos!=null) {
	    	int i=0;
	    	for(Asiento item:asientos){
	    		if (item!=null){
	    			i++;
	    		}
	    	}
	    		return i;
	    	
		}
	    
	    return 0;	
	}
	public String verificarIntegridad(){
		
		for (Asiento item:asientos) {
			
			if ((item!=null && this.registro!=item.registro )|| (item!=null && this.registro!=this.motor.registro)){
				
				return "Las piezas no son originales";
			}	
		}
			return "Auto original";
	}
		
}

	

