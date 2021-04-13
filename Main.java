import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
    ControlDePalabras controlJuego = new ControlDePalabras();
    Ahorcado ahorcado = new Ahorcado();
    Jugador jugadorA = new Jugador();
    
    //System.out.println("Hello " + test1.getNombre());
    //ahorcado.imprimirImagenAhorcado(jugadorA);
    /*for(int i=0;i<10; i++){
    ControlDePalabrasJuego.escogerPalabraAleatoria();
    
    ControlDePalabrasJuego.imprimirPalabra(jugadorA);
    System.out.println(" ");
    System.out.println(" ");
    }
    */

    controlJuego.iniciarJuego(jugadorA);
   /* ahorcado.imprimirImagenAhorcado(jugadorA);
    controlJuego.imprimirPalabra(jugadorA);
     */                 
        while(controlJuego.isEstadoDeJuego() == false)
        {
            ahorcado.imprimirImagenAhorcado(jugadorA);
            controlJuego.imprimirPalabra(jugadorA);

            while(controlJuego.isEstadoDeJuego() == false)
            {
            System.out.println("LETRAS INCORRECTAS:");
            for(String st : jugadorA.getLetrasIncorrectas()){
            System.out.print(st+" ");}
            System.out.println("\n\n");

            System.out.println("Ingrese letra:");
            Scanner ingresada = new Scanner(System.in);
            String letra = ingresada.nextLine();
            String letraMin = letra.toLowerCase();
            
            //controlJuego.escogerPalabraAleatoria();
            controlJuego.letraEnPalabra( letraMin , jugadorA );
            ahorcado.imprimirImagenAhorcado(jugadorA);
            
            controlJuego.imprimirPalabra(jugadorA);
            
            
            }
            System.out.println("FIN");
            controlJuego.seguirJugando(jugadorA);
        }
  }
}