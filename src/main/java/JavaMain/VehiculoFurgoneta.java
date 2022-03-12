package JavaMain;

public class VehiculoFurgoneta extends Vehiculo{
	
	private int carga;
	
	/**
	 * @Description Constructor de vehiculoFurgoneta
	 * @author rmarquez
	 * @date 12/03/2022
	 * @param N/A
	 * @return String, String, String, int
	 */
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public String mostrarDatosDelVehiculo() {
		return "Matricula: " +getMatricula() + "\nMarca: " +getMarca() + "\nModelo: " +getModelo() + "\nCilindrada: " +getCarga();
	}


}
