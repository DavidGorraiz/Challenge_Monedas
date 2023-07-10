package javachallenge;

import javax.swing.JOptionPane;

public class CuadroDialogoOpciones {
	
	public static void main(String[] args) {
		String moneda;
		moneda = (JOptionPane
				.showInputDialog
				(null, "Elige la moneda a la "
						+ "que deseas "
						+ "convertir tu "
						+ "dinero","Monedas", 
						JOptionPane
						.PLAIN_MESSAGE,null,
						new Object[] {"De Pesos a Dólar", 
								"De Pesos a Euro",
								"De Pesos a Libras",
								"De Pesos a Yen",
								"De Pesos a Won Coreano",
								"De Dólar a Pesos",
								"De Euro a Pesos",
								"De LIbras a Pesos"},
						"Selecciona")).toString();
	}
}

