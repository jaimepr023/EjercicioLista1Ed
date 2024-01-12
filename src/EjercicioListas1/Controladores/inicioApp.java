package EjercicioListas1.Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EjercicioListas1.Servicios.metodoImplementacion;
import EjercicioListas1.Servicios.metodosInterfaz;

public class inicioApp {

	public static void main(String[] args) {
		metodosInterfaz mi = new metodoImplementacion();
		Scanner sc = new Scanner(System.in);
		
		//Crear lista y declarada
		List<Integer> listaNumero = new ArrayList<Integer>();
		
		//Pedir los numeros
		mi.pedirNum(sc, listaNumero);
		
		//Mostrar con bucle foreach
		mi.mostrarLista(listaNumero);
		
		System.out.println(); 
		
		//Modifica la lista con el metodo get y set
		mi.modificar(listaNumero);
		
		//Muestra la lista con el metodo for
		mi.mostrarConFor(listaNumero);
	}

}
