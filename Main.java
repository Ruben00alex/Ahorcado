class Main {
  public static void main(String[] args) {
  
    control controlJuego = new control();
    Ahorcado test1 = new Ahorcado();
    
    //System.out.println("Hello " + test1.getNombre());
    test1.imprimirImagenAhorcado();
    for(int i=0;i<10; i++){
    controlJuego.escogerPalabraAleatoria();
    
    }
  }
}