package Facturacion;

import java.util.Scanner;

public class MenuPrincipal {
	private String cuenta;
	private String nombre_y_apellido;
	
	public MenuPrincipal(String cuenta, String nombre_y_apellido) {
		this.cuenta = cuenta;
		this.nombre_y_apellido = nombre_y_apellido;
	}
	
	public MenuPrincipal() {}
	
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getNombreYApellido() {
		return nombre_y_apellido;
	}
	public void setNombreYApellido(String nombre_y_apellido) {
		this.nombre_y_apellido = nombre_y_apellido;
	}
	
	
	public String toString() {
		return cuenta + "\t" +  nombre_y_apellido + "\t";
	}
	
	public void solicitarInformacion(Scanner entrada) {
		
		System.out.println("Cuenta "+((this.cuenta!=null)?"(Cuenta anterior: "+this.cuenta+")":""));
		/*if (this.cuenta!=null)
			System.out.println("(Cuenta anterior: "+this.cuenta+")");*/
		this.cuenta = entrada.next();
		
		System.out.println("Nombre y Apellido "+((this.nombre_y_apellido!=null)?"(Nombre anterior: "+this.nombre_y_apellido+")":""));
		this.nombre_y_apellido = entrada.next();
	}
}
