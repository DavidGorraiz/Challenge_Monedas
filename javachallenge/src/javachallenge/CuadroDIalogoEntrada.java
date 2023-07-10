package javachallenge;

import javax.swing.JOptionPane;

public class CuadroDIalogoEntrada {
	
	public static void main(String[] args) {
		int cantidad;
		cantidad = Integer.parseInt
				(JOptionPane
				.showInputDialog
				("Ingresa la "
						+ "cantidad "
						+ "de dinero que desea"
						+ " convertir:"));
		
		JOptionPane.showMessageDialog
		(null, "La cantidad que "
				+ "usted escogio es: "
		+cantidad);
	}

}
