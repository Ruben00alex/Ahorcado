import java.util.Scanner;
import java.util.Random;

public class control{

    private String[] palabras= {"Perro", "Gato", "Carro", "XD", "México","Prueba", "QueSesto", "MadreMiaWilly"};
    private String palabra;
    private boolean juegoGanado;
    private Random rand = new Random();
    
    public control(){

    }
    
    public void iniciarJuego() {
        juegoGanado = false; //false porque no se ha ganado arre(8
        System.out.println("Juego iniciado" );
    }

    public boolean seguirJugando() {
        System.out.println("Desea seguir jugando? S/N ");
        Scanner scan = new Scanner(System.in);
        String opcion = scan.nextLine();
        String op2 = opcion.toLowerCase();
        
        if (op2.equals("s") == true) {
            System.out.println("Seguir jugando");
        } else if (op2.equals("n") == true) {
            juegoGanado = true;
            System.out.println("Fin del juego");
        } else {
            System.out.println("No valido");
        }
        return juegoGanado;
    }

    public boolean isEstadoDeJuego() {
        return juegoGanado;
    }

    public void escogerPalabraAleatoria(){
        palabra = palabras[rand.nextInt(palabras.length)];

        System.out.println(palabra );

    }
}
