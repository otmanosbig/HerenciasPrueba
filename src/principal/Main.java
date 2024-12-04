package principal;

import clases.Coche;
import clases.Moto;
import clases.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//voy a crear un vehiculo
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setDatos();
		
		System.out.println("El vehiculo introducido es " + vehiculo.toString());
		
		System.out.println("Hola");
		//Voy a crear un coche subclase (hijo)
		//Coche coche = new Coche();
		//Con poliformismo
		vehiculo = new Coche();
		vehiculo.setDatos();
		
		System.out.println("El coche introducido es " + vehiculo.toString());
		
		System.out.println("Introduce moto");
		vehiculo = new Moto();
		vehiculo.setDatos();
		
		System.out.println("La moto introducida es " + vehiculo.toString());
	}

}
