public class control{

    private boolean estadoDeJuego = false;

    public void iniciarJuego() {
        estadoDeJuego = true;
        System.out.println("Juego iniciado " + estadoDeJuego);
    }

    public boolean seguirJugando() {
        System.out.println("Desea seguir jugando? S/N ");
        Scanner scan = new Scanner(System.in);
        String opcion = scan.nextLine();
        String op2 = opcion.toLowerCase();
        //System.out.println(opcion.toString());

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
}

}
