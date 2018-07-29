package Facturacion;

import java.util.ArrayList;
import java.util.Scanner;

import Facturacion.MenuPrincipal;

public class Menu {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<MenuPrincipal> Menus = new ArrayList<MenuPrincipal>();
		ArrayList<Productos> inventario = new ArrayList<Productos>();
		
		int opcion=0;
		do {
			System.out.println("1. Agregar un Cliente\n"
					+ "2. Modificar una cuenta\n"
					+ "3. Mostrar registros\n"
					+ "4. Añadir Productos\n"
					+ "0. Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				//Crear una instancia del tipo alumno
				MenuPrincipal a = new MenuPrincipal();
				//Solitar la informacion
				a.solicitarInformacion(entrada);
				//Agregar la instancia al ArrayList
				Menus.add(a);
				break;
			case 2:
				//Solicitar el indice que desea modificar
				System.out.println("¿Que registro desea modificar?");
				int indiceModificar = entrada.nextInt();
				MenuPrincipal alumnoSeleccionado = Menus.get(indiceModificar);
				//Solitar de nuevo la informacion para el objeto seleccionado
				alumnoSeleccionado.solicitarInformacion(entrada);
				//Sustituir el objeto con set
				Menus.set(indiceModificar, alumnoSeleccionado);
				break;
			case 3:
				System.out.println("----Clientes Registrados----");
				for (MenuPrincipal menu_principal : Menus) {
					System.out.println(menu_principal.toString());
				}
				break;
			case 4:
				//Solicitar informacion del producto
				System.out.println("Código del producto:");
				String codigo = entrada.next();
				System.out.println("Descripcion del producto:");
				String descripcion = entrada.next();
				System.out.println("Precio del producto:");
				String precio = entrada.nextInt();
				//Crear objeto de la clase producto
				Productos b = new Producto(codigo, descripcion, precio);
				inventario.add(b);
				break;
			default:
				break;
			}
		}while(opcion!=0);
		
		entrada.close();
	}
}
