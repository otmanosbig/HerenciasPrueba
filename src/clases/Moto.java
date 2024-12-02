package clases;

public class Moto extends Vehiculo {
	
	private boolean tieneSidecar;

	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	
	//setDatos
		public void setDatos() {
			super.setDatos();
			System.out.println("Tiene sidecar: ");
			tieneSidecar = sc.next().equalsIgnoreCase("si");
		}

		@Override
		public String toString() {
			return "Es una Moto, con matricula " + super.getMatricula() + " y los caballos " + super.getCaballos() +  "[tieneSidecar=" + tieneSidecar + "]";
		}
	
}

