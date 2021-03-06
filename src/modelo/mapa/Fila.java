package modelo.mapa;

import modelo.unidades.Colocable;

import java.util.ArrayList;

public class Fila {

    private final ArrayList<Casillero> casilleros;

    public Fila() {
        this.casilleros = new ArrayList<>();
    }

    public void agregarCasilleros(ArrayList<Casillero> casilleros) {

        this.casilleros.addAll(casilleros);
    }

    public Casillero buscarCasillero(int columna) {
        return this.casilleros.get(columna - 1);
    }

    public void colocar(Colocable colocable, int columna) {
        this.buscarCasillero(columna).colocar(colocable);
    }

    public void descolocar(int columna) {
        this.buscarCasillero(columna).desocupar();
    }

    public Colocable buscarColocableEn(int columna) {
        return this.buscarCasillero(columna).getColocable();
    }

}
