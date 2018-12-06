package controlador.botonesaldeano;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.juego.Juego;
import modelo.unidades.aldeano.Aldeano;
import vista.ContenedorPrincipal;

public class IniciarConstruccionCuartelEventHandler implements EventHandler<ActionEvent> {

    public final Aldeano aldeano;
    public final ContenedorPrincipal contenedorPrincipal;

    public IniciarConstruccionCuartelEventHandler(Aldeano aldeano, ContenedorPrincipal contenedorPrincipal) {
        this.aldeano = aldeano;
        this.contenedorPrincipal = contenedorPrincipal;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        this.contenedorPrincipal.setMensaje("Haz click en donde\n quieres colocar el\n cuartel");
        this.contenedorPrincipal.cambiarHandlerConstruirCuartel(this.aldeano);
    }
}
