package ejercisio1;

public class Factura extends SinOferta {
	protected int totalProductos = 0;
	public Cliente comprador;
	public Producto[] arrProducto;
	public int [] arrCantidad;
	public final int maxProducto;
	
	public Factura(int maxP, Cliente comprad, Producto[] arrProd,int[] arrCant) {
		this.comprador = comprad;
		this.arrProducto = arrProd;
		this.arrCantidad = arrCant;
		this.maxProducto = maxP;
	}
	
	public void anadirProd(Producto p, int i) {
		 arrProducto[i] = p;
	}
	
	public void anadirCant(int cant, int i) {
		arrCantidad[i] = cant;
	}
	
	public void mostrarFactura() {
		System.out.println(comprador.mostrarCliente(comprador));
		System.out.println("*  *  *  *  *  PRODUCTOS  *  *  *  *  *");
		System.out.println("Código:  " + "Descripción:     " + "Cantidad: " + "Precio:   ");
		
		Producto xProducto = null;
		
		Factura nFactura = new Factura(maxProducto, comprador, arrProducto, arrCantidad);
		
		for(int j = 0; j < arrProducto.length; j++) {
			if(arrProducto[j] instanceof SinOferta) {
				xProducto = new SinOferta();
				xProducto = arrProducto[j];
				nFactura.calcularPrecio(xProducto);
				nFactura.mostrarProducto(xProducto);
			}
			if (arrProducto[j] instanceof EnOferta) {
				xProducto = new EnOferta();
				xProducto = arrProducto[j];
				nFactura.calcularPrecio(xProducto);
				nFactura.mostrarProducto(xProducto);
			}
			for(int z = 0; z < arrCantidad.length; z++) { 
				totalProductos = totalProductos + (arrCantidad[z]);
			}
			
				float calcularTotal =(float) (totalProductos * prec);
			
			

			System.out.print("\n" + "Cantidad de Productos en esta factura: " + totalProductos);
			System.out.println("\n " + "Total a pagar: "+ calcularTotal);
		}
	}
	
	
	public void mostrarProducto (Mostrable productoXX) {
		System.out.print("\n" + productoXX.mostrar());
	}
	public void calcularPrecio(Calculable productoXX) {
		productoXX.calcular();
	}

	
	public int getTotalProductos() {
		return totalProductos;
	}

	public void setTotalProductos(int totalProductos) {
		this.totalProductos = totalProductos;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public Producto[] getArrProducto() {
		return arrProducto;
	}

	public void setArrProducto(Producto[] arrProducto) {
		this.arrProducto = arrProducto;
	}

	public int[] getArrCantidad() {
		return arrCantidad;
	}

	public void setArrCantidad(int[] arrCantidad) {
		this.arrCantidad = arrCantidad;
	}

	public int getMaxProducto() {
		return maxProducto;
	}
	
}
