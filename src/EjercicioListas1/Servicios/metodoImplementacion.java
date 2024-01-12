package EjercicioListas1.Servicios;

import java.util.List;
import java.util.Scanner;

public class metodoImplementacion implements metodosInterfaz {

	
	public void pedirNum(Scanner sc,List<Integer> numerosE) {
		
		System.out.println("¿Cuantos numero quiere almacenar?");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
		System.out.println("Dame el numero " + i);
		 int n= sc.nextInt();
		 numerosE.add(n); 
		}
	}

	public void mostrarLista(List<Integer> numerosE) {
		
		for(Object nom : numerosE){
			System.out.print(nom + " ");
		}	
	}
	
	public void modificar(List<Integer> numerosE) {
		
		int aux = numerosE.get(2);
		numerosE.set(2,numerosE.get(4));
		numerosE.set(4, aux);
		
	}

	public void mostrarConFor(List<Integer> numerosE) {
		
		for(int i=0;i<numerosE.size();i++) {
			System.out.print(numerosE.get(i) + " ");
		}
	}
}
