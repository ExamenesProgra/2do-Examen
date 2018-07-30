package ejercisio1;

public class EnOferta extends Producto implements Calculable, Mostrable {

	private float desc, pTotal=0, pFinal= 0, Total= 0, iva=12;
	public EnOferta() {}
	
	public EnOferta(int cod, String descrip, int cant, float prec, float desc) {
		this.cant = cant;
		this.cod = cod;
		this.descrip = descrip;
		this.prec= prec;
		this.desc = desc;
	}

	public String mostrar() {
		EnOferta pEO = new EnOferta(cod, descrip, cant, prec, desc);
		String mostrarP = "" + pEO.getCod() + "  " + pEO.getDescrip() + "  " + pEO.getCant() + "  " + pEO.getPrec() + "  " + pEO.getDesc();
		return mostrarP;
	}

	public float calcular() {
		this.setpFinal(calcularTotal() - ((calcularTotal()* getDesc()) /100));
		return getpFinal();
	}
	
	public float calcularTotal() {
		setTotal(getPrec() * getCant());
		return Total;
	}

	public void leerProducto(EnOferta pEO) {
		pEO.setCant(cant);
		pEO.setCod(cod);
		pEO.setDescrip(descrip);
		pEO.setPrec(prec);
		pEO.setDesc(desc);
		
	}
	
	

	public float getDesc() {
		return desc;
	}

	public void setDesc(float desc) {
		this.desc = desc;
	}

	public float getpTotal() {
		return pTotal;
	}

	public void setpTotal(float pTotal) {
		this.pTotal = pTotal;
	}

	public float getpFinal() {
		return pFinal;
	}

	public void setpFinal(float pFinal) {
		this.pFinal = pFinal;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	@Override
	void leerProducto() {
		// TODO Auto-generated method stub
		
	}
}

