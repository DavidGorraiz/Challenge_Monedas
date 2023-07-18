package javachallenge;

import javax.swing.JOptionPane;

public class Opcion {
	private String moneda
	, msg="Programa Finalizado"
	, continuar= "¿Desea continuar?";
	double Dolar, Euro, Libras, Yen, Won;
	int respuesta, Pesos;
	
	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String mostrarOpciones() {
		this.moneda = (JOptionPane
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
		return this.moneda;
	}
	
	public void mostrarResultado(Cantidad cantidad) {
		
		switch (this.moneda) {
			case "De Pesos a Dólar": 
				Dolar = cantidad.getCantidad() * 0.00024;
				JOptionPane.showMessageDialog(null, "Tienes $"
					+Dolar+" Dolares");
				break;
			case "De Pesos a Euro":
				Euro = cantidad.getCantidad() * 0.00022;
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Euro+" Euros");
				break;
			case "De Pesos a Libras":
				Libras = cantidad.getCantidad() * 0.00019;
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Libras+" Libras");
				break;
			case "De Pesos a Yen":
				Yen = cantidad.getCantidad() * 0.034;
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Yen+" Yens");
				break;
			case "De Pesos a Won Coreano":
				Won = cantidad.getCantidad() * 0.31;
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Won+" Wons Coreanos");
				break;
			case "De Dólar a Pesos":
				Pesos = (int) (cantidad.getCantidad() * 4015);
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Pesos+" Pesos");
				break;
			case "De Euro a Pesos":
				Pesos = (int) (cantidad.getCantidad() * 4514.93);
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Pesos+" Pesos");
				break;
			case "De LIbras a Pesos":
				Pesos = (int) (cantidad.getCantidad() * 5253.57);
				JOptionPane.showMessageDialog(null, "Tienes $"
						+Pesos+" Pesos");
				break;
		}
	}
	
	private int respuesta() {
		return JOptionPane.showConfirmDialog(null, continuar);
	}
	
	private void mostrarFin() {
		JOptionPane.showInternalMessageDialog(null, msg);
	}
	
	public void Continuar(Cantidad cantidad) {
		while(respuesta() == 0) {
			mostrarOpciones();
			mostrarResultado(cantidad);
		}
		mostrarFin();
	}
}
