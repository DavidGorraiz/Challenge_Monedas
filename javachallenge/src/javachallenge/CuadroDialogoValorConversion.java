package javachallenge;

import javax.swing.JOptionPane;

public class CuadroDialogoValorConversion {
	
	public static void main(String[] args) {
		Cantidad cantidad = new Cantidad();
		Opcion opcion = new Opcion();
		try {
			cantidad.setCantidad();
			cantidad.mostrarCantidad();
			
			opcion.mostrarOpciones();
			opcion.mostrarResultado(cantidad);
			opcion.Continuar(cantidad);
			
		} catch (NumberFormatException e) {
			String msg = "El valor no es valido.";
			JOptionPane.showMessageDialog
			(null, msg);
		}
		
	}

}
