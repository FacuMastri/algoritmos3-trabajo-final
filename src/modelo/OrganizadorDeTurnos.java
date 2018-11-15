package modelo;

import modelo.Civilizacion;
import java.util.Random;

public class OrganizadorDeTurnos {
	private Civilizacion civilizacionEnTurno;
	private Civilizacion civilizacionEnEspera;
	
	public OrganizadorDeTurnos(Civilizacion civilizacion1, Civilizacion civilizacion2) {
		if(new Random().nextBoolean()) {
			civilizacionEnTurno = civilizacion1;
			civilizacionEnEspera = civilizacion2;
		}else {
			civilizacionEnTurno = civilizacion2;
			civilizacionEnEspera = civilizacion1;
		}
	}
	
	public Civilizacion cambiarTurno() {
		civilizacionEnTurno.avanzarTurnoCivilizacion();
		civilizacionEnTurno.avanzarTurnoCivilizacion();
		Civilizacion aux = civilizacionEnTurno;
		civilizacionEnTurno = civilizacionEnEspera;
		civilizacionEnEspera = aux;
		return civilizacionEnTurno;
	}
}