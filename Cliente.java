package ejercisio1;

public class Cliente {

	private String nombre; 
	private String cedula;
	
	public Cliente(String nombCliente, String cedCliente) {
	
		this.nombre = nombCliente;
		this.cedula = cedCliente;
	}
	
	public void leerCliente (Cliente c) {
		c.setCedula(cedula);
		c.setCedula(nombre);
	}
	
	
	public String mostrarCliente(Cliente c) {
		String mostrarC = " " + "\n" + "Datos del cliente: " + "\n"
	    + "Nombre:  " + cC.getNombre() + "  Cedula:  "+ cC.getCedula()+"\n";
		return mostrarC;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nomb) {
		this.nombre = nomb;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String ced) {
		this.cedula = ced;
	}
	
	
	
}
