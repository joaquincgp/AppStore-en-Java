import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int op;
            AppStore appStore = new AppStore();
            do {
                System.out.println(" ------- MENU ------- ");
                System.out.println("1. Visualizar la información detallada de cada juego");
                System.out.println("2. Comprar licencias de un juego");
                System.out.println("3. Vender licencias de un juego");
                System.out.println("4. Consultar el juego más vendido");
                System.out.println("5. Consultar los descuentos aplicados por un volumen de compra");
                System.out.println("6. Salir");
                System.out.println("Ingrese un número: ");
                op = Integer.parseInt(sc.next());
                switch (op) {
                    case 1: {
                        String nombreJuego;
                        do {
                            System.out.println("Escribe el nombre del producto que desea ver: \n 1. Modern Combat \n 2. Candy Crush " +
                                    "\n 3. FIFA 22 \n 4. Mortal Kombat");
                            sc.nextLine();
                            nombreJuego = sc.nextLine();
                        } while (nombreJuego == null);
                        Juego juego = appStore.getJuego(nombreJuego);
                        if (nombreJuego != null) {
                            System.out.println("Nombre: " + juego.getNombre());
                            System.out.println("Categoria: " + juego.getCategoria());
                            System.out.println("Precio: " + juego.getPrecio());
                            System.out.println("Tamano en memoria (kilobytes): " + juego.getTamano());
                            System.out.println("Licencias disponibles: " + juego.getLicenciasDisponibles());
                            System.out.println("Licencias vendidas: " + juego.getLicenciasVendidas());
                        } else {
                            System.out.println("Ingrese un producto válido");
                        }
                    }break;

                    case 2:{
                        String nombreCompra;
                        do {
                            System.out.println("Escribe el nombre del producto que desea comprar: \n 1. Modern Combat \n 2. Candy Crush " +
                                    "\n 3. FIFA 22 \n 4. Mortal Kombat");
                            sc.nextLine();
                            nombreCompra = sc.nextLine();
                        } while (nombreCompra == null);
                        Juego juegoCompra = appStore.getJuego(nombreCompra);
                        System.out.println("Cuantas unidades desea adquirir?: ");
                        int cantidad = sc.nextInt();
                        juegoCompra.comprarJuego(cantidad);
                    }break;
                    case 3: {
                        String nombreVenta;
                        do {
                            System.out.println("Escribe el nombre del producto que desea vender: \n 1. Modern Combat \n 2. Candy Crush " +
                                    "\n 3. FIFA 22 \n 4. Mortal Kombat");
                            sc.nextLine();
                            nombreVenta = sc.nextLine();
                        } while (nombreVenta == null);
                        Juego juegoVenta = appStore.getJuego(nombreVenta);
                        System.out.println("Cuantas unidades desea vender?: ");
                        int cantidad = sc.nextInt();
                        int cantidadVendida = juegoVenta.venderJuego(cantidad);
                    }break;

                    case 4:{
                        List<Juego> listaJuegos = new ArrayList<>();
                        listaJuegos.add(appStore.getJuego1());
                        listaJuegos.add(appStore.getJuego2());
                        listaJuegos.add(appStore.getJuego3());
                        listaJuegos.add(appStore.getJuego4());
                        Juego juegoMasVendido = null;
                        int maxVentas = 0;
                        for (Juego juego: listaJuegos) {
                            if(juego.getLicenciasVendidas()>maxVentas){
                                juegoMasVendido = juego;
                            }
                        }
                        System.out.println("El juego mas vendido es: "+juegoMasVendido.getNombre());
                    }break;


                }
            } while (op != 6);



        }
    }
