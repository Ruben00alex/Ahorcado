import java.util.Scanner;
import java.util.Random;

public class control{

    private String[] palabras= {"Perro", "Gato", "Carro", "XD", "México"};
    private String palabra;
    private boolean estadoDeJuego = false;

    private Random rand = new Random();
    public control(){

    }
    public void iniciarJuego() {
        estadoDeJuego = true;
        System.out.println("Juego iniciado");
    }

    public boolean seguirJugando() {
        System.out.println("Desea seguir jugando? S/N ");
        Scanner scan = new Scanner(System.in);
        String opcion = scan.nextLine();
        String op2 = opcion.toLowerCase();
       
        if (op2.equals("s") == true) {
            estadoDeJuego = true;
            System.out.println("Seguir jugando " + estadoDeJuego);
        } else if (op2.equals("n") == true) {
            estadoDeJuego = false;
            System.out.println("Fin del juego " + estadoDeJuego);
        } else {
            System.out.println("No valido");
        }
        return estadoDeJuego;
    }

    public boolean isEstadoDeJuego() {
        return estadoDeJuego;
    }

    public void escogerPalabraAleatoria(){
        palabra = palabras[rand.nextInt(palabras.length)];

        System.out.println(palabra );

    }
}
