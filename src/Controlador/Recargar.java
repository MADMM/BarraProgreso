package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Recargar {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		 
		
		   Vista vista = new Vista();

		   Controlador controlador = new Controlador(vista,modelo);
		 
		   Pantalla splash = new Pantalla();
		 
		  
		   vista.setVisible(true);

	}

}
