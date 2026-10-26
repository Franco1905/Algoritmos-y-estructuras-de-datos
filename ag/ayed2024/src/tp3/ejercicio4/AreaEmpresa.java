package tp3.ejercicio4;

public class AreaEmpresa {
	private String identificacion;
	private int tardanaza; /// tiempo que tarda en mandarse un mensaje

	public AreaEmpresa(String identificacion, int tardanaza) {
		this.identificacion = identificacion;
		this.tardanaza = tardanaza;
	}

	public AreaEmpresa() {
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getTardanaza() {
		return tardanaza;
	}

	public void setTardanaza(int tardanaza) {
		this.tardanaza = tardanaza;
	}

}
