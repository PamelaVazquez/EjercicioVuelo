package ar.edu.unlam.pb2.vuelos;

import java.util.LinkedList;
import java.util.List;

public class Vuelo {
	private Integer nro_vuelo;
	private Boolean avionDespego;
	private List<Integer> listaDeAsientos;
	
	public Vuelo(Integer nroVuelo) {
		this.nro_vuelo = nroVuelo;
		this.avionDespego = false;
		this.listaDeAsientos = new LinkedList<Integer>();
	}
	
	public Integer getNroVuelo() {
		return this.nro_vuelo;
	}
}
