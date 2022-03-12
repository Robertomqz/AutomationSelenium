package JavaMain;

public class VehiculoDeportivo extends Vehiculo {
	
	private int cilindrada;
	
	/**
	 * @Description Constructor de vehiculoDeportivo
	 * @author rmarquez
	 * @date 12/03/2022
	 * @param N/A
	 * @return String, String, String, int
	 */
	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String mostrarDatosDelVehiculo() {
		return "Matricula: " +getMatricula() + "\nMarca: " +getMarca() + "\nModelo: " +getModelo() + "\nCilindrada: " +getCilindrada();
	}


}
