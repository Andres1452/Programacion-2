package co.edu.uniquindio.biblioteca;

public class Charmander extends  Pokemon implements iFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println ("Hola soy chanmander y este es mi ataqe placaje");

    }

    @Override
    protected void atacarGarraso() {
        System.out.println ("Hola soy chanmander este y es mi ataqe Garraso");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println ("Hola soy chanmander este y es mi ataqe Mordisco");

    }

    @Override
    public void AtacarGolpeFuego() {
        System.out.println ("Este es mi ataque especial golpe de fuego");

    }

    @Override
    public void AtacarLanzaLLamas() {
        System.out.println ("Este es mi ataque especial lanxa llamas");

    }
}
