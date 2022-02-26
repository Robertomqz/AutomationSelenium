package JavaBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HolaMundo {
	
	int sumatoria = 10;
	
	public static void main (String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Hola");
	}//end main
	
	@Test(priority=2)
	public void showConsole() {
		System.out.println("Hola Mundo TestNG");
		Reporter.log("Hola Mundo",true);
		sumatoria = sumatoria + 1;
		Reporter.log("La sumatoria es: "+ sumatoria,true);
		
	}// end showConsol
	
	
	
	@Test(priority=1)
	public void typeOfVariables() {
			int numero1 = 10;
			char letra = 'S';
			float numeroDecimal = 10.5f;
			double numeroGrande = 10.23142124;
			boolean flag = true;
			int numero2; //No need to assign since the beginning 
			
			// Variables Type Object
			String  nombre = "Roberto";
			Boolean flag2 = false;
			Double nombreGrande2 = 100023.123123;
			Reporter.log("El valor de la variable: "+numero1,true);
			sumatoria = numero1 + sumatoria + 1;
			Reporter.log("La sumatoria es: "+ sumatoria,true);
						
	}//end typeOfVariables
	
	@Test(priority=3)
	public void operacionesAritmeticas() {
		int numero1 = 10;
		int numero2 = 99;
		double resultado = numero1 + numero2;
		Reporter.log("El resultado de la suma es: "+resultado,true);
		
		resultado = numero1 - numero2;
		Reporter.log("El resultado de la resta es: "+resultado,true);
		
		resultado = numero1 * numero2;
		Reporter.log("El resultado de la multiplicaciones: "+resultado,true);
		
		resultado = numero1/numero2;
		Reporter.log("El resultado de la division: "+resultado,true);
		
		resultado = numero1%numero2;
		Reporter.log("El resultado del residuo : "+resultado,true);
		
		
		
	}

}//end Class
