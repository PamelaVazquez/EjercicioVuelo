package ar.edu.unlam.pb2.vuelos;

import java.util.LinkedList;
import java.util.List;

public class Pasajero {
	private String nombre;
	private Integer dni;
	private List<Vuelo> listaVuelos;

	
	public Pasajero(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.listaVuelos = new LinkedList<Vuelo>();
	}
	
	public void comprarPasaje(Integer nroVuelo) {
		this.listaVuelos.add(new Vuelo(nroVuelo));
	}
	
	public List<Vuelo> getListaVuelos(){
		return this.listaVuelos;
	}
	
	public Boolean existeVuelo(Integer nro_vuelo) {
		Boolean existe = false;
		for(Vuelo v:this.listaVuelos) {
			if(v.getNroVuelo()==nro_vuelo)
				existe=true;
		}
		return existe;
	}
}
