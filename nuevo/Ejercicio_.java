package ejercisio1;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Ejercicio_ {
	
	
	private static int opcion = 0;
	private static String menu;
	
	
	public static void main(String[] args) throws IOException, Exception {
		
		
		int i = 0;
		Producto xProducto =null;
		Producto[] arrProd =null;
		int [] arrCant;
		final int maxProd = 1;
		arrProd = new Producto[maxProd];
		arrCant = new int[maxProd +1];
		int cod = 0, cant =0;
		float precio = 0, descuento = 10;
		String resp = "", resp2 = "", cad = "", nombre = "", cedula = "", descrip = "";
		Validar v = new Validar(cad);
		Cliente comprador = new Cliente(nombre, cedula);
		Factura nuevaFact = new Factura(maxProd, comprador, arrProd, arrCant);
		
		
		do {
			mostrarMenu();
			
			try {
				
				do {
					cad = JOptionPane.showInputDialog(menu);
					v = new Validar (cad);
					if (v.validarNumeros(v) )  {
						opcion = Integer.parseInt(cad);
					}
				}while (!v.validarNumeros(v) );
				
				
				switch (opcion)   {
				case 1:
					
					do {
						nombre = JOptionPane.showInputDialog("Nombre: ");
						v = new Validar(nombre) ;
						
					} while (!v.validarLetras(v));
					
                   do {
                	   cedula= JOptionPane.showInputDialog(null, "Cuenta: ");
                       v = new Validar (cedula) ;
                   } while (!v.validarNumeros(v));
                   
                   
                   comprador = new Cliente(nombre, cedula) ;
                   
                   
                   comprador.leerCliente(comprador);
                   
                   
                   nuevaFact = new Factura(maxProd, comprador, arrProd, arrCant);
                   
                   
                   JOptionPane.showMessageDialog(null, "...Cliente registrado");
                   
                   
                   
                   resp = JOptionPane.showInputDialog("Desea registrar un producto");
                   while (!resp.matches ("([S|s|N|n])+")) {
                      JOptionPane.showMessageDialog(null, "Opcion invalida....");
                      resp = JOptionPane.showInputDialog("Desea registrtar un producto");
				}

			while ((("S".equals(resp)) ||  ("s".equals(resp)))  &&  (i < maxProd)) {
			    do {
			    	cad = JOptionPane.showInputDialog(null,"Introduzca el codigo del producto:");
			    	v = new Validar(cad);
			    	if (v.validarNumeros(v))   {
			    		cod = Integer.parseInt(cad);
			    		
			    	}
			    } while (!v.validarNumeros(v));
			    do {
			    	descrip = JOptionPane.showInputDialog(null,"Introduzca el producto:");
			    			
			    } while (descrip == null || descrip == "");
			    do {
			    	cad = JOptionPane.showInputDialog(null,"Introduzca la cantidad de productos","Datos del Pro");
			    	v = new Validar(cad);
			    	if (v.validarNumeros(v))  {
			    		cant = Integer.parseInt(cad);
			    	
			    	}
			    } while  (!v.validarNumeros(v));
			    do {
			    	cad = JOptionPane.showInputDialog(null, "Introduzca el precio del productos"+  "Datos del Producto");
			    	v = new Validar (cad);
			    	if (v.validarNumeros(v))  {
			    		precio = Float.parseFloat(cad);
			    	}
			    	
			    } while (!v.validarNumeros (v));
			
			    
			    resp2 = JOptionPane.showInputDialog(null,"Este producto esta en OFERTA? S/N","",i);
			    while (!resp2.matches("([S|s|N|n])+"))  {
			    	JOptionPane.showMessageDialog(null, "Opcion Invalida.... solo acepta S/N");
			    	resp2 = JOptionPane.showInputDialog(null, "Este producto esta en oferta...? S/N","",i);
			    }
			    
			    
   			  if (("S".equals(resp2)) || ("s".equals(resp2)))   {
   				  xProducto = (EnOferta) new EnOferta (cod, descrip, cant,precio,descuento);
   				 ((EnOferta) xProducto).leerProducto((EnOferta) xProducto  ); 
   				nuevaFact.anadirProd((EnOferta) xProducto, i);
   			  }
   			  
   			  
			  if (("N".equals((resp2)))  ||  ("n".equals(resp2)))   {
				  xProducto = (SinOferta) new SinOferta(cod,  descrip, cant, precio);
				((SinOferta) xProducto).leerProducto((SinOferta) xProducto );
				nuevaFact.anadirProd((SinOferta) xProducto, i);
			  }
			  
			  
			
			  nuevaFact.anadirCant (cant, i);
			  
			  
			  arrProd[i] = nuevaFact.arrProducto[i];
			  arrCant[i] = nuevaFact.arrCantidad[i];
			  
			  
			  i++;
			  
			  
			  JOptionPane.showMessageDialog(null, "Producto Registrado...");
			  
			  
			  resp = JOptionPane.showInputDialog(null, "Desea incluir otra");
			
			break;
			}
		      case 2:
		
            
		    nuevaFact= new Factura(maxProd, comprador, arrProd, arrCant);		 
		
	        
		    nuevaFact.mostrarFactura();
		    break;
		    
		     case 3:
		   break;
		   
		    default:
			JOptionPane.showMessageDialog(null,"* * * Opcion Invalida * * *");
			break;
		    }
			
		
		if (resp == null || resp2 == null)  {
			throw new Exception ("Error...");
		}
		
			}catch (NullPointerException error)   {
				JOptionPane.showMessageDialog(null, "Regresara al MENU PRINCIPAL...");
	        }
	} while (opcion != 3);

  }

  public static void mostrarMenu()  {
	  menu =  "";
      menu += "************************************************************" + "\n";
      menu += "*                   SISTEMA DE FACTURACION                 *" + "\n";
      menu += "************************************************************" + "\n";
      menu += "1. Crear Factura" + "\n";
      menu += "2. Mostrar Factura" + "\n";
      menu += "3. Salir" + "\n" + "\n";
      menu += "Selecciona una Opcion";
  }
}