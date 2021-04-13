class Main {
  public static void main(String[] args) {
  
    control controlJuego = new control();
    Ahorcado test1 = new Ahorcado();
    Jugador jugadorA = new Jugador();
    
    //System.out.println("Hello " + test1.getNombre());
    test1.imprimirImagenAhorcado(jugadorA);
    for(int i=0;i<10; i++){
    controlJuego.escogerPalabraAleatoria();
    
    controlJuego.imprimirPalabra(jugadorA);
    System.out.println(" ");
    System.out.println(" ");
    }
    controlJuego.iniciarJuego();
                      
        while(controlJuego.isEstadoDeJuego() == false)
        {
            controlJuego.seguirJugando();
        }
  }
}