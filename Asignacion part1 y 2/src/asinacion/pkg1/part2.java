import java.util.Scanner;
class Equipo {
    private String nombre;
    private int juegosJugados;
    private int juegosGanados;
    private int juegosEmpatados;
    private int juegosPerdidos;
    private int golesFavor;
    private int golesEnContra;

    public int calcularPuntos() {
        return juegosJugados * 3 + juegosEmpatados;
    }
    public int calcularBono() {
        return calcularPuntos() * 100
        + golesFavor * 500
        - juegosPerdidos * 500
        + (juegosJugados % 2 == 0 ? 5000 : 0);
    }
    public String toString()  {
        return String.format("Nombre: %-20s, Bono: %-10d, Puntos: %-10d", nombre, calcularBono(), calcularPuntos());
    }
    public static Equipo creaEquipo( String nombre, int jj, int jg, int je, int jp, int gf, int ge ) {
        Equipo e          = new Equipo();
        e.nombre          = nombre;
        e.juegosJugados   = jj;
        e.juegosGanados   = jg;
        e.juegosEmpatados = je;
        e.juegosPerdidos  = jp;
        e.golesFavor      = gf;
        e.golesEnContra   = ge;
        return e;
    }

}