package JavaMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arreglos {
	
	private int numero1;
	private int numero2;
	
	
	/**
	 * @Description Constructor SIN parametros
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param N/A
	 * @return N/A
	 */
	public Arreglos() {

	}
	
	
	/**
	 * @Description Constructor con dos parametros
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param int,int
	 * @return N/A
	 */
	public Arreglos(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	/**
	 * @Description Regresa el valor del numero 1
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param N/A
	 * @return int
	 */
	public int getNumero1() {
		return numero1;
	}
	
	/**
	 * @Description Regresa el valor del numero 2
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param N/A
	 * @return int
	 */
	public int getNumero2() {
		return numero2;
	}
	
	/**
	 * @Description Inicializa el valor del numero 1
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param int
	 * @return N/A
	 */
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	/**
	 * @Description Inicializa el valor del numero 1
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param int
	 * @return N/A
	 */
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	/**
	 * @Description Crear arreglo,asignarle valor y mostrarlo en consola los valores
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param N/A
	 * @return N/A
	 */
	public void crearArreglos() {
		int[] arreglo1 = {2,4,6,7};
		int sizeArreglo = arreglo1.length;
		
		for (int i = 0; i < sizeArreglo; i++) {
			System.out.println("El valor del arreglo es: " + arreglo1[i]);
		}
		
		int [] arreglo2 = new int[9];
		
		for (int i = 0; i < arreglo2.length; i++) {
			
			arreglo2[i] = i + 1;
			System.out.println("El valor del arreglo es: " + arreglo2[i]);
		}
		
		int suma = 0;
		for (int i = 0; i < arreglo1.length; i++) {
			suma = suma + arreglo1[i];
			
		}
		
		System.out.println("El valor de la sumatoria del primer arreglo es:" + suma);
		
		int suma2 = 0;
		for (int i = 0; i < arreglo2.length; i++) {
			suma2 = suma2 + arreglo2[i];
			
		}
		
		System.out.println("El valor de la sumatoria del segundo arreglo es:" + suma2);
				
		
		}
			
	/**
	 * @Description Invertir el orden de un arreglo
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param N/A
	 * @return N/A
	 */
	public void invertirOrdenArreglo() {
		int[] arreglo1 = {1,2,3,4,5};
		int[] arreglo2 = new  int [arreglo1.length];
		
		for (int i = 0 ; i < arreglo1.length ; i++) {
			System.out.println("El valor del arreglo1 es : " + arreglo1[i]);
		}
		
		for (int i = (arreglo1.length - 1) ; i >= 0 ; i--) {
			System.out.println("El valor del arreglo1 invertido es : " + arreglo1[i]);
			
		}
		
		for ( int i = (arreglo1.length - 1), j=0 ; i >= 0 ; i--, j++) {
			arreglo2[j] = arreglo1[i];
			System.out.println("El arreglo2 invertiod es: " + arreglo2[j]);
			
		}
	}
		
	/**
	 * @Description Lista de enteros
	 * @author rmarquez
	 * @date 05/03/2022
	 * @param N/A
	 * @return N/A
	 */
	public void listasDeEnteros() {
		List < Integer > listaNumeros = new ArrayList<>();
		listaNumeros.add(3);
		listaNumeros.add(5);
		listaNumeros.add(3);
		listaNumeros.add(70);
		listaNumeros.add(4);
		listaNumeros.add(3);
		
		System.out.println("El valor de la lista es: " + listaNumeros);
		
		Collections.sort(listaNumeros);
		System.out.println("El valor de la lista ordenada es: " + listaNumeros);
		
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println("El valor de la lista ordenada de mayor a menor: " + listaNumeros);
		
		System.out.println("El numero mayor de la lista es: " + Collections.max(listaNumeros));
		System.out.println("El numero menor de la lista es: " + Collections.min(listaNumeros));
		
		Object ultimo = null;
		int contador = 0;
		Iterator<Integer>  i = listaNumeros.iterator();
		
		while(i.hasNext()) {
			Object temporal = i.next();
			
			if (temporal.equals(ultimo)) {
				i.remove();
				contador++;
			}
			else {
				ultimo = temporal;
			}
		}
		
		System.out.println("La cantidad de numeros repetidos fue: " + contador);
		System.out.println("La lista sin elementos repetidos es: " + listaNumeros);
		


		
		
	}

}// end of Class
