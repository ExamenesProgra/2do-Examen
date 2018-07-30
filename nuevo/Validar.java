package ejercisio1;

import javax.swing.JOptionPane;

public class Validar {
	public String cadena;

	public Validar(String cadena) {
		this.cadena = cadena;
	}
	
	public boolean validarLetras(Validar cc) throws Exception{
		try {
			if(cc.getCadena().matches("")) {
				throw new Exception("Error..!");
			}
			if(cc.getCadena().matches("([a-z]|[A-Z])+")) {
				return true;
			}else {
				throw new Exception("Error..!");
			}
		}catch(NullPointerException error) {
			JOptionPane.showMessageDialog(null, "Regresará al menú principal");
		}catch(Exception error) {
			JOptionPane.showMessageDialog(null, "Debe ingresar solo letras");
		}
		return false;
	}
	
	public boolean validarNumeros(Validar cn) throws Exception{
		try {
			Double.parseDouble(cn.getCadena());
			return true;
		}catch (NumberFormatException error) {
			return false;
		}
	}
	
	Validar(){
		throw new UnsupportedOperationException("Aún no es compatible");
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
}
