package JavaBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Tarea1 {

	
	@Test
	public void numberCompture() {
		Scanner capture = new Scanner(System.in);
		double num1,num2;
		
		do {
			
			Reporter.log("Ingersa el primer numero a comparar",true);
			num1 = capture.nextDouble();
			Reporter.log("Ingersa el segundo numero a comparar",true);
			num2 = capture.nextDouble();
			
			numberComparator(num1,num2);
		}
		while (num1 != num2);
					
	}//endnumberCapture
	

	public void numberComparator(double num1, double num2) {
		if(num1 > num2) {
			Reporter.log("El primer numero ingresado es mayor [" + num1 + " > " + num2,true);
		}
		else if (num2 > num1) {
			Reporter.log("El segundo numero ingresado es mayor [" + num2 + " > " + num1,true);
		}
		else if (num2 == num1) {
			Reporter.log("Ambos numeros son iguales [" + num2 + " = " +num1,true);
			Reporter.log("Programa Terminado",true);
		}
		else {
			Reporter.log("Ingreso Invalido",true);
		}	
		
	}//endnumberCapturator
	
}//end of Class
	
