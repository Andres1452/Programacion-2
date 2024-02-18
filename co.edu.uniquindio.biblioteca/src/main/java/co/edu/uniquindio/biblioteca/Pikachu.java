package co.edu.uniquindio.biblioteca;

public class Pikachu extends Pokemon implements iElectrico {
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println ("Hola soy Pikachu y este es mi ataqe Placaje");

    }

    @Override
    protected void atacarGarraso() {
        System.out.println ("Hola soy Pikachu y este es mi ataqe Garraso");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println ("Hola soy Pikachu y este es mi ataqe Mordisco");

    }


    @Override
    public void AtacarImpactrueno() {
        System.out.println ("Este es mi ataque especial impactrueno");

    }

    @Override
    public void AtacarGolpeTrueno() {
        System.out.println ("este es mi ataque especial atacar trueno");

    }
}

