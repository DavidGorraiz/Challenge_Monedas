package javachallenge;

import javax.swing.JOptionPane;

public class Cantidad {
	
	private double cantidad;

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad() {
		this.cantidad = Double.parseDouble
				(JOptionPane
				.showInputDialog
				("Ingresa la "
						+ "cantidad "
						+ "de dinero que desea"
						+ " convertir:"));
	}
	
	public void mostrarCantidad() {
		JOptionPane.showMessageDialog
		(null, "La cantidad que "
				+ "usted escogio es: "
		+cantidad);
	}

}
