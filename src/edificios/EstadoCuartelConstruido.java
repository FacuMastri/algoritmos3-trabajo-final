package edificios;

import modelo.Oro;
import unidades.Arquero;
import unidades.Espadachin;

public class EstadoCuartelConstruido implements EstadoCuartel {

	

	@Override
	public void recibirDanio(Edificio cuartel, int danio) {
		cuartel.recibirDanioConValor(danio);		
	}


	@Override
	public Espadachin crearEspadachin(Oro oro) {
		Espadachin espadachin = new Espadachin(oro);
		return espadachin;
		
	}

	@Override
	public Arquero crearArquero(Oro oro) {
		Arquero arquero = new Arquero(oro);
		return arquero;
		
	}
	
	@Override
	public void avanzarTurno(Edificio cuartel) {
		// TODO Auto-generated method stub
		
	}	



	@Override
	public void repararse(Cuartel cuartel) {
		cuartel.repararseASimismo();
		
	}


	@Override
	public void repararse(Edificio edificio) {
		// TODO Auto-generated method stub
		
	}

}