import java.util.Scanner;
import java.util.Random;
//import org.apache.commons.lang3.StringUtils;

public class control{

    private String[] palabras= {"Perro", "Gato", "Carro", "XD", "México","Prueba", "QueSesto", "MadreMiaWilly"};
    private String palabra;
    private boolean juegoGanado;
    private Random rand = new Random();
    
    public control(){

    }
    
    public void iniciarJuego() {
        juegoGanado = false;
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

    public void imprimirPalabra(Jugador jugador){
        jugador.getLetrasCorrectas().replaceAll(String::toLowerCase);//Cambia getLetrasCorrectas a minuscula.
        for(int i = 0 ; i < palabra.length(); i++ ){
            if(jugador.getLetrasCorrectas().contains(String.valueOf( palabra.charAt(i) ).toLowerCase() ) ){
                System.out.print(String.valueOf(palabra.charAt(i) ));
            }else{System.out.print("_ ");}
            
            //ESTODOTEAAM WUUUUUUUUU
            }
        }

    public void escogerPalabraAleatoria(){
        palabra = palabras[rand.nextInt(palabras.length)];

        System.out.println(palabra );

    }
}
     

     

    

        

           
                
            

        

    

     