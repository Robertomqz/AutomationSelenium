package JavaBasics;

import org.testng.annotations.Test;

import JavaMain.Vehiculo;
import JavaMain.VehiculoDeportivo;
import JavaMain.VehiculoFurgoneta;
import JavaMain.VehiculoTurismo;

public class TestVehiculo {
	
	@Test
	public void datosVehiculo() {
	
		Vehiculo misVehiculos = new Vehiculo("GSTW-2323","FORD","2020");
		System.out.println(misVehiculos.mostrarDatosDelVehiculo());
		
		misVehiculos.setMatricula("GHZ-80-A");
		System.out.println(misVehiculos.mostrarDatosDelVehiculo());
		
		misVehiculos = new VehiculoDeportivo("LAER-2345","MAZDA","2022",4);
		System.out.println(misVehiculos.mostrarDatosDelVehiculo());	
	
	}
	
	@Test
	public void datosVehiculoEnArreglo() {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0] = new Vehiculo ("GJT-289","BMW","2021");
		misVehiculos[1] = new VehiculoDeportivo ("LKC-674","Audi","2022",8);
		misVehiculos[2] = new VehiculoFurgoneta ("QPR-5869","Mercedez Benz","2019",500);
		misVehiculos[3] = new VehiculoTurismo ("WER-345","Ferrari","1980",3);
		
		for(Vehiculo coche: misVehiculos) {
			System.out.println(coche.mostrarDatosDelVehiculo());
			System.out.println("\n");
			
			
		}

		
	}
	
	

}
