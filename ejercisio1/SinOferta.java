package ejercisio1;

public class SinOferta extends Producto implements Calculable, Mostrable {

	private float pTotal=0, pFinal=0, Total=0, iva=12;
	public SinOferta() {}
	
	public SinOferta(int cod, String descrip, int cant, float prec) {
		this.cant = cant;
		this.cod = cod;
		this.descrip = descrip;
		this.prec= prec;
	}
	
	
	public String mostrar() {
		SinOferta pSO = new SinOferta(cod, descrip, cant,prec);
		String mostrarP = "" + pSO.getCod() + "  " + pSO.getDescrip() + "  " + pSO.getCant() + "  " + pSO.getPrec();
		return mostrarP;
	}

	public float calcular() {
		this.setpFinal(calcularTotal());
		return 0;
	}
	public float calcularTotal() {
		setTotal(getPrec() * getCant());
		return Total;
	}

	public void leerProducto(SinOferta pSO) {
		pSO.setCod(cod);
		pSO.setDescrip(descrip);
		pSO.setCant(cant);
		pSO.setPrec(prec);
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
