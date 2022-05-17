package ar.edu.unlam.pb2.vuelostest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.vuelos.Pasajero;
import ar.edu.unlam.pb2.vuelos.Vuelo;

public class PasajeroTest {
	@Test
	public void dadoQueExisteElVueloSeDebePoderComprarUnPasaje() {
		Vuelo vuelo = dadoQueExisteElVuelo(1);
		Pasajero pasajero = dadoQueExisteElPasajero("Pamela", 12345678);
		cuandoElPasajeroCompraUnPasaje(pasajero, vuelo);
		entoncesRealizoLaCompra(pasajero, vuelo.getNroVuelo());
	}
	

	private void entoncesRealizoLaCompra(Pasajero pasajero, Integer nroVuelo) {
		Assert.assertTrue(pasajero.existeVuelo(nroVuelo));		
	}

	private void cuandoElPasajeroCompraUnPasaje(Pasajero pasajero, Vuelo vuelo) {
		pasajero.comprarPasaje(vuelo.getNroVuelo());	
	}

	private Pasajero dadoQueExisteElPasajero(String nombre, Integer dni){	
		return new Pasajero(nombre, dni);
	}

	private Vuelo dadoQueExisteElVuelo(Integer nroVuelo) {
		return new Vuelo(nroVuelo);
	}
	
}
