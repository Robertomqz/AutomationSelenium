package JavaMain;

public class VehiculoTurismo extends Vehiculo {
	
	private int numeroPuertas;

	/**
	 * @Description Constructor de vehiculoTurismo
	 * @author rmarquez
	 * @date 12/03/2022
	 * @param N/A
	 * @return int, String, String, String
	 */
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroPuertas
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	/**
	 * @param numeroPuertas the numeroPuertas to set
	 */
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	@Override
	public String mostrarDatosDelVehiculo() {
		return "Matricula: " +getMatricula() + "\nMarca: " +getMarca() + "\nModelo: " +getModelo() + "\nNumeroPuertas: " +getNumeroPuertas();
	}
	

}
