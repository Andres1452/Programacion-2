package co.edu.uniquindio.biblioteca;

public class Squarel extends Pokemon implements iAgua{
    @Override
    protected void atacarPlacaje() {
        System.out.println ("Hola soy Squarel y este es mi ataqe Placaje");

    }

    @Override
    protected void atacarGarraso() {
        System.out.println ("Hola soy Squarel y este es mi ataqe Garraso");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println ("Hola soy Squarel y este es mi ataqe Mordisco");

    }

    @Override
    public void AtacarHidrobomba() {
        System.out.println ("Este es mi ataque especial Hidrobomba");

    }

    @Override
    public void AtacarBurbija() {
        System.out.println ("Este es mi ataque especial burbuja ");

    }
}
