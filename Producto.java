package ejercicio_1;

public abstract class Producto implements Calculable, Mostrable {

	protected int cod;
	protected String descrip; 
	protected float prec;
	protected int cant;
	
	public Producto() {	
	}

	public Producto(int cod, String descrip, float prec, int cant) {
		this.cod = cod;
		this.descrip = descrip;
		this.prec = prec;
		this.cant = cant;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public float getPrec() {
		return prec;
	}

	public void setPrec(float prec) {
		this.prec = prec;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	public abstract String mostrar();
	public abstract float calcular();
	abstract void leerProducto();
	
}
