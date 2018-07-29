
public class Productos {
	private int idProducto;
	private String producto;
	private int precioProducto;
	
  public Productos(int idProducto, String producto, int precioProducto) {
		this.idProducto = idProducto;
		this.producto = producto;
		this.precioProducto = precioProducto;
	}
	public Productos() {}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}
	
	@Override
	public String toString() {
		return idProducto + "-" + producto + "-" + precioProducto;
	}
	
	
}
