public class AppStore {
    public Juego juego1;
    public Juego juego2;
    public Juego juego3;
    public Juego juego4;

    public AppStore(){
        juego1 = new Juego("Modern Combat", Juego.Categoria.ACCION, 28, 500000, 20, 0);
        juego2 = new Juego("Candy Crush", Juego.Categoria.ROMPECABEZAS, 5, 100000, 40, 0);
        juego3 = new Juego("FIFA 22", Juego.Categoria.DEPORTE, 30, 10000000, 15, 0);
        juego4 = new Juego("Mortal Kombat", Juego.Categoria.ACCION, 9, 5000000, 25, 0);
    }

    public Juego getJuego1() {
        return juego1;
    }

    public Juego getJuego2() {
        return juego2;
    }

    public Juego getJuego3() {
        return juego3;
    }

    public Juego getJuego4() {
        return juego4;
    }

    public Juego getJuego( String pNombre )
    {
        Juego juegoLocalizado = null;

        if( juego1.getNombre( ).equals( pNombre ) ) {
            juegoLocalizado = juego1;
        } else if( juego2.getNombre().equals( pNombre ) ) {
            juegoLocalizado = juego2;
        } else if(juego3.getNombre( ).equals( pNombre ) ) {
            juegoLocalizado = juego3;
        } else if( juego4.getNombre( ).equals( pNombre ) ) {
            juegoLocalizado = juego4;
        }
        return juegoLocalizado;

    }
}
