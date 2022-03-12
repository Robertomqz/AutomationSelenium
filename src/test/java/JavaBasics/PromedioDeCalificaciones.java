package JavaBasics;

import java.util.Scanner;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PromedioDeCalificaciones {
	
	double cal1 = 20;
	double cal2 = 90;
	double cal3 = 80;
	double cal4 = 70;
	
	@Test 
	public void calcularPromedio() {
		double resultado = (cal1 + cal2 + cal3 + cal4)/4;
		
//		Reporter.log("El resultado del promedio es: [ " +resultado+" ]",true);
		
		if(resultado >= 70 && resultado <= 100) {
			Reporter.log("Estas approbado con: [ "+resultado+" ]",true);
		}
		else if (resultado < 70 && resultado >= 0) {
			Reporter.log("Estas approbado con: [ "+resultado+" ]",true);	
		}
		else {
			Reporter.log("Las calificaciones ingresadas estan fuera de rango promedio [ "+resultado+" ]",true);
		}
		
		if(resultado >= 70 || resultado < 100) {
			Reporter.log("OR Estas approbado con: [ "+resultado+" ]",true);
		}
		
	}//end calcularPromedio
	
	@Test
	public void calcularPromedioPorTeclado() {
		Scanner reader = new Scanner(System.in);
		
		do {
		Reporter.log("Ingresa la calificacion1:", true);
		cal1=reader.nextDouble();
		
		Reporter.log("Ingresa la calificacion2:", true);
		cal2=reader.nextDouble();
		} 
		while ((cal1 < 0 || cal1 > 100) || (cal2 < 0 || cal2 > 100));
		
		double resultado = (cal1 + cal2)/2;
		
		Reporter.log("El promedio de calificaciones es :" + resultado,true);
		
		calcularPromedio(resultado);

		
	}
	
	public void calcularPromedio(double resultado) {
		
		
//		Reporter.log("El resultado del promedio es: [ " +resultado+" ]",true);
		
		if(resultado >= 70 && resultado <= 100) {
			Reporter.log("Estas approbado con: [ "+resultado+" ]",true);
		}
		else if (resultado < 70 && resultado >= 0) {
			Reporter.log("Estas approbado con: [ "+resultado+" ]",true);	
		}
		else {
			Reporter.log("Las calificaciones ingresadas estan fuera de rango promedio [ "+resultado+" ]",true);
		}
		
		
	}//end calcularPromedio

		
	
	
	
	
	
	
	

}//end class
