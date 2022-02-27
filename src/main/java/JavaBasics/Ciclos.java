package JavaBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.Scanner;

public class Ciclos {
	
	@Test
	public void ciclo() {
	int numero = 10;
	int index = 0;
	
	for (int i = 0; i <= numero; i++) {
		Reporter.log("El valor de nuestro indice es: " + i, true);
	}
	
	System.out.println("\n");
		
	while (index <= numero) {
		Reporter.log("El valor de nuestro indice es WHILE: " + index, true);
		index++;
	}
	
	
	}// endCiclo
	
	@Test
	public void condicionalSwitch() {
		Scanner reader = new Scanner(System.in);
		Reporter.log("Ingersa un numero de mes",true);
		String mes = reader.next();
		
		switch (mes) {
		
		case "1":
			Reporter.log("Enero",true);
			break;
		case "2":
			Reporter.log("Febrero",true);
			break;
		case "3":
			Reporter.log("Marzo",true);
			break;
		case "4":
			Reporter.log("Abril",true);
			break;
		case "5":
			Reporter.log("Mayo",true);
			break;
		case "6":
			Reporter.log("Junio",true);
			break;
		case "7":
			Reporter.log("Julio",true);
			break;
		case "8":
			Reporter.log("Agosto",true);
			break;
		case "9":
			Reporter.log("Septiembre",true);
			break;
		case "10":
			Reporter.log("Octubre",true);
			break;
		case "11":
			Reporter.log("Noviembre",true);
			break;
		case "12":
			Reporter.log("Diciembre",true);
			break;
			
		default:
			Reporter.log("El numero que ingresaste no corresponde a ningun mes [ "+mes+" ]",true);
			
		
		}//endswitch
		
		
		
	}
	
	

}//end class
