package EjercicioListas1.Servicios;

import java.util.List;
import java.util.Scanner;

public interface metodosInterfaz {

	public void pedirNum(Scanner sc, List<Integer> numerosE);
	
	public void mostrarLista(List<Integer> numerosE);
	
	public void modificar(List<Integer> numerosE);
	
	public void mostrarConFor(List<Integer> numerosE);
}
