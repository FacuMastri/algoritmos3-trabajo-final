package edificios;

import modelo.Oro;
import unidades.Arquero;
import unidades.Espadachin;

public interface EstadoCuartel extends EstadoEdificio {
	
	public  Espadachin crearEspadachin(Oro oro);
	public Arquero crearArquero(Oro oro);

}
