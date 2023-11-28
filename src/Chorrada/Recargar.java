package Chorrada;

public class Recargar {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		 
		
		   Vista vista = new Vista();

		   Controlador controlador = new Controlador(vista,modelo);
		 
		   PantallaChorra splash = new PantallaChorra();
		 
		  
		   vista.setVisible(true);

	}

}
