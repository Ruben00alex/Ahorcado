import java.util.Scanner;
import java.util.Random;

import java.util.*; 
//import org.apache.commons.lang3.StringUtils;

public class control{

    private String[] palabras= {"Perro", "Gato", "Carro", "Programacion", "Mexico","Prueba", "Murcielago", "Vancouver"};
    private String palabra;
    private ArrayList<String> palabraSinRepeticiones = new ArrayList<>(); 
    private boolean juegoGanado;
    private Random rand = new Random();
    private int letras ;
    public control(){

    }
    
    public boolean letraEnPalabra(String letra, Jugador jug1){
        
        boolean valRet = false;
        if(palabra.toLowerCase().contains(letra)&& !jug1.getLetrasCorrectas().contains(letra)){
            valRet = true;
            jug1.getLetrasCorrectas().add(letra);
        }else /*if(!jug1.getLetrasCorrectas().contains(letra))*/{
            valRet = false;
            if(!jug1.getLetrasIncorrectas().contains(letra)&&!jug1.getLetrasCorrectas().contains(letra)){
            jug1.getLetrasIncorrectas().add(letra);}

            jug1.setConteoErrores(jug1.getConteoErrores() + 1);

        }
        System.out.println(jug1.getLetrasCorrectas().size() +" ;"  + letras);  

        if(jug1.getConteoErrores() >= 6 || jug1.getLetrasCorrectas().size()>= letras ){
            System.out.println("FIN DEL JUEGO.");
            juegoGanado = true;
        }
        return valRet;

    }
    public void iniciarJuego(Jugador jug1) {
        this.escogerPalabraAleatoria();
        juegoGanado = false;
        jug1.setConteoErrores(0);
        jug1.getLetrasCorrectas().removeAll(jug1.getLetrasCorrectas());
        jug1.getLetrasIncorrectas().removeAll(jug1.getLetrasIncorrectas());
        palabraSinRepeticiones.removeAll(palabraSinRepeticiones);
        System.out.println("Juego iniciado" );
    }

    public boolean seguirJugando(Jugador jug1) {
        System.out.println("Desea seguir jugando? S/N \n");
        Scanner scan = new Scanner(System.in);
        String opcion = scan.nextLine();
        String op2 = opcion.toLowerCase();
        
        if (op2.equals("s") == true) {
            System.out.println("Seguir jugando");
            juegoGanado = false;
            this.iniciarJuego(jug1);
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
            }System.out.print(" ");
        }

    public void escogerPalabraAleatoria(){
        int numRand = rand.nextInt(palabras.length);

        palabra = palabras[numRand];
        System.out.println(palabra.length());
        letras = 0;
        for(int i = 0 ; i < palabra.length(); i++){
            if(!palabraSinRepeticiones.contains(String.valueOf(palabra.charAt(i)).toLowerCase())){
                letras ++;
                palabraSinRepeticiones.add( String.valueOf(palabra.charAt(i)).toLowerCase());
            }

        }
        

        //System.out.println(palabraSinRepeticiones);
        //System.out.println(letras);

    }
}
     

     

    

        

           
                
            

        

    

     