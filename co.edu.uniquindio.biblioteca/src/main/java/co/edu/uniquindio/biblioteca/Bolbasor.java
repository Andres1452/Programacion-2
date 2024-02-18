package co.edu.uniquindio.biblioteca;

public class Bolbasor extends Pokemon implements iPlanta{
    public Bolbasor() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println ("Hola soy Bolbasor y este es mi ataqe Placaje");

    }

    @Override
    protected void atacarGarraso() {
        System.out.println ("Hola soy Bolbasor y este es mi ataqe Garraso");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println ("Hola soy Bolbasor y este es mi ataqe Mordisco");



    }

    @Override
    public void Atacarhojas() {
        System.out.println ("Este es mi ataque especiel hojas navaja");

    }

    @Override
    public void AtacarLatigaso() {
        System.out.println ("Este es mi ataque espciel latigaso");

    }
}
