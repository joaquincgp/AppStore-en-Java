public class Juego {

    /**
     * Enumeradores para la clasificacion del juego
     */
    public enum Categoria
    {
        /**
         * Representa los juegos del genero rombecabezas
         */
        ROMPECABEZAS,
        /**
         * Representa los juegos del genero accion
         */
        ACCION,
        /**
         * Representa los juegos del genero deportivo
         */
        DEPORTE;
    }

    /**
     * Nombre unico
     */
    private String nombre;
    /**
     * Categoria a la que pertenece
     */
    private Categoria categoria;
    /**
     * Precio de la unidad
     */
    private double precio;

    /**
     * Memoria en kilobytes
     */
    private double tamano;

    /**
     * Numero de licencias disponibles
     */
    private int licenciasDisponibles;
    /**
     * Numero de licencias vendidas
     */
    private int licenciasVendidas;

    //Imagen del juego por anadir

    /**
     * Crea un nuevo juego con los valores dados por par�metro. <br>
     * @param nombre Nombre del juego. nombre != null.
     * @param categoria Categoria a la que pertenece el juego. categoria != null && categoria != "".
     * @param precio Valor unitario del producto. precio >= 0.
     * @param tamano Tamano de la memoria interna que ocupa el juego medida en kilobytes. tamano >= 0.
     * @param licenciasVendidas Cantidad de licencias que han sido vendidas. licenciasVendidas >= 0.
     * @param licenciasDisponibles Cantidad de licencias restantes. licenciasDisponibles >= 0.
     */
    public Juego(String nombre, Categoria categoria, double precio, double tamano, int licenciasDisponibles, int licenciasVendidas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.tamano = tamano;
        this.licenciasDisponibles = licenciasDisponibles;
        this.licenciasVendidas = licenciasVendidas;
    }


    /**
     * Retorna el nombre del juego
     * @return Nombre del juego
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Retorna la categoria del juego
     * @return Categoria del juego
     */
    public Categoria getCategoria() {
        return categoria;
    }
    /**
     * Retorna el valor del juego
     * @return Precio unitario del juego
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Retorna el tamano en memoria del juego
     * @return Tamano del juego
     */
    public double getTamano() {
        return tamano;
    }
    /**
     * Retorna la cantidad de licencias disponibles
     * @return Licencias disponibles del juego
     */
    public int getLicenciasDisponibles() {
        return licenciasDisponibles;
    }
    /**
     * Retorna la cantidad de licencias vendidas
     * @return Licencias vendidas del juego
     */
    public int getLicenciasVendidas() {
        return licenciasVendidas;
    }

    public void calcularVentas(int pLicenciasVendidas, Categoria pCategoria){
        double total = 0;
        double descuento = 0;
        if(pLicenciasVendidas>25 && pCategoria== Categoria.ROMPECABEZAS){
            descuento = 0.25;
        }

    }

    /**
     * Comprar juego
     * @param pCantidad Cantidad de licencias por adquirir
     */
    public void comprarJuego(int pCantidad){
        licenciasDisponibles += pCantidad;
    }

    /**
     * Vender juego
     * @param pCantidad Cantidad de licencias a vender
     * @return cantidad vendida
     */
    public int venderJuego( int pCantidad )
    {
        int cantidadVendida = 0;

        if( pCantidad > licenciasDisponibles )
        {
            cantidadVendida = licenciasVendidas;
            licenciasDisponibles = 0;
        }
        else
        {
            licenciasDisponibles -= pCantidad;
            cantidadVendida = pCantidad;
        }

        licenciasVendidas += cantidadVendida;
        return licenciasVendidas;
    }

    /**
     * Visualizar informacion detallada de cada juego
     */
    public void mostrarInformacion(){
        System.out.println("Nombre del juego: "+nombre+"\n Categoria: "+categoria+
                "\n Precio: "+precio+"\n Tamaño (kb): "+tamano+ "\n Licencias disponibles: "+licenciasDisponibles
                + "\n Licencias vendidas: "+licenciasVendidas);
    }


}
