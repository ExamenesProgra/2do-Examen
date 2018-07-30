import java.io.IOException;
import javax.swing.JOptionPane;
public class Ejercicio_1 {
	
	
	private static int opcion = 0;
	private static String menu;
	
	
	public static void main(String[] args) throws IOException, Exception {
		
		
		int i =;
		Producto xProducto =null;
		Producto[] arrProd =null;
		int [] arrCant;
		final int maxProd = 3;
		arrProd = new Producto[maxProd];
		arrCant = new int[maxProd +1];
		int cod = 0, cant =0;
		float precio = 0, descuento = 10;
		String resp = "", resp2 = "", cad = "", nombre = "", cedula = "", descrip = "";
		Validar v = new Validar (cad);
		Cliente comprador = new Cliente(nombre, cedula);
		Factura nuevaFact = new Factura(maxProd, comprador, arrProd, arrCant);
		
		
		do {
			mostrarMenu();
			
			try {
				
				do {
					cad = JOptionPane.shovImputDialog(menu);
					v = new Validar (cad);
					if (v.validarNumeros(v) )  {
						opcion = Integer.parseInt(cad);
					}
				}while (!v.validarNumeros(v) );
				
				
				switch (opcion)   {
				case 1:
					
					do {
						nombre = JOptionPane.shovImputDialog("Nombre del Comprador:")
						v = new Validar(nombre) ;
						
					} while (!v.ValidarLetras(v));
					
                   do {
                	   cedula= JOptionPane.shovImputDialog(null, "Cedula del Comprador")
                       v = new Validar (cedula) ;
                   } while (!v.validarNumeros(v));
                   
                   
                   comprador = new Cliente(nombre, cedula) ;
                   
                   
                   comprador.leerCliente(comprador);
                   
                   
                   nuevaFact = new Factura(maxProd, comprador, arrProd, arrCant);
                   
                   
                   JOptionPane.shovMessegeDialog(null, '...Cliente registrado')
                   
                   
                   
                   resp = JOptionPane.shov.ImputDialog("Desea registrar un producto")
                   while (!resp.matches (" [S|s|N|n]")+")) {
                      JOptionPane.shovMessageDialog(null, "Opcion invalida....")
                      resp = JOptionPane.shovImputDialog("Desea registrtar un producto")
				}

			while ((("S".equals)(resp)) | |  ("s".equals(resp)))  &&  (i < maxProd)
			    do {
			    	cad = JOptionPane.shovImputDialog(null,"Introduzca el ")
			    	v = new Validar(cad);
			    	if (v.validarNumeros(v))   {
			    		cod = Integer.parseInt(cad);
			    		
			    	}
			    } while (!v.validarNumeros(v));
			    do {
			    	descrip = JOptionPane.shovImputDialog(null,"Introduzca la Descripcion del producto:",)
			    			
			    } while (descrip == null || descript =="");
			    do {
			    	cad = JOptionPane.shovInputDialog(null,"Introduzca la cantidad de productos","Datos del Pro")
			    	v = new Validar(cad);
			    	if (v.validarNumeros(v))  {
			    		cant = Integer.parseInt(cad);
			    	
			    	}
			    } while  (!v.validarNumeros(v));
			    do {
			    	cad = JOptionPane.shovInputDialog(null, 'Introduzca el precio del productos',)  "Datos del Producto"
			    	v = new Validar (cad);
			    	if (v.validarNumeros(v))  {
			    		precio = Float.parseFloat(cad)
			    	}
			    	
			    } while (!v.validarNumeros (v));
			
			    
			    resp2 = JOptionPane.shovInputDialog(null,"Este producto esta en OFERTA? S/N","",i)
			    while (!resp2.matches("([S|s|N|n])+"))  {
			    	JOptionPane.shovMessageDialog(null, "Opcion Invalida.... solo acepta S/N");
			    	resp2 = JOptionPane.shovImputDialog(null, "Este producto esta en oferta...? S/N","",i);
			    }
   			  if (("S".equals(resp2)) || ("s".equals(resp2)))   {
   				  xProducto = (EnOferta) new EnOferta (cod, descript, cant,)
   						 ((EnOferta) xProducto).leerProducto((EnOferta) xProduct  ) 
   			  }
			  if (("N".equals((resp2)))  ||  ("n".equals(resp2)))   {
				  xProducto = (sinOferta(cod,  descript, cant ))
				((SinOferta) xProducto) .leerProducto((SInOferta) xProducto )
				nuevaFact.anadirProd((SinOferta) xProducto, i);
			  }
			
			  nuevaFact.anadirCant (cant, i);
			  
			  
			  arrProd[i] = nuevaFact.arrProducto[i]
			  arrCant[i] = nuevaFact.arrCantidad[i];
			  
			  
			  i++;
			  
			  
			  JOptionPane.shovMessageDialog(null, "Producto Registrado...")
			  
			  
			  resp = JOptionPane.shovInputDialog(null, "Desea incluir otra")
			}
			
			break;
		case 2;	
		
            
		    nuevaFact= new Factura(maxProd, comprador, arrProd, arrCant);		 
		
	        
		    nuevaFact.mostrarFactura();
		    break;
		    
		case 3;
		   break;
		   
		default:
			JOptionPane.shovMessageDialog(null,"* * * Opcion Invalida * * *")
		}
		
		
		if (resp == null || resp2 == null)  {
			throw new Exception ("Error...");
		}
	catch (NullPointerException error)   {
		JOptionPane.shovMessageDialog(null, "Regresara al MENU PRINCIPAL...");
	}
	} while (opcion != 3)

  }

  public static void mostrarMenu()  {
	  menu =  "";
      menu += "************************************************************" + "\n";
      menu += "*                   SISTEMA DE FACTURACION                 *" + "\n";
      menu += "************************************************************" + "\n";
      menu += "                    MiniMARKET  UPEL-IPB  " + "\n";
      menu += "1. Crear Factura" + "\n";
      menu += "2. Mostrar Factura" + "\n";
      menu += "3. Salir" + "\n" + "\n";
      menu += "Selecciona una Opcion";
      
  
  
  }
