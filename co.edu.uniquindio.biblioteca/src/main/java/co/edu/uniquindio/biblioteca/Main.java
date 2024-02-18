package co.edu.uniquindio.biblioteca;

public class Main {
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu();
        Bolbasor bolbasor = new Bolbasor();
        Squarel squarel = new Squarel();
        Charmander charmander= new Charmander();

        pikachu.atacarGarraso();
        pikachu.AtacarImpactrueno();
        charmander.AtacarGolpeFuego();
        charmander.atacarPlacaje();
        squarel.atacarMordisco();
        squarel.AtacarHidrobomba();
        bolbasor.AtacarLatigaso();
        bolbasor.atacarMordisco();

    }
}