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
    private int letras = 0;
    public control(){

    }
    
    /*
List<Integer> listWithDuplicates = Lists.newArrayList(0, 1, 2, 3, 0, 0);
    List<Integer> listWithoutDuplicates = new ArrayList<>(
      new HashSet<>(listWithDuplicates));

    


    static LinkedHashSet removeDuplicates(String str)   
    {     
        //Create LinkedHashSet of type character   
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
        // print the string after removing duplicate characters   
        return set;   
    }   

*/
    public boolean letraEnPalabra(String letra, Jugador jug1){
        
        boolean valRet = false;
        if(palabra.toLowerCase().contains(letra)){
            valRet = true;
            jug1.getLetrasCorrectas().add(letra);
        }else{
            valRet = false;
            jug1.setConteoErrores(jug1.getConteoErrores() + 1);
        }
        if(jug1.getConteoErrores() > 6 || jug1.getLetrasCorrectas().size()>= letras ){
            System.out.println("FIN DEL JUEGO.");
            juegoGanado = true;
        }
        return valRet;

    }
    public void iniciarJuego() {
        this.escogerPalabraAleatoria();
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
            juegoGanado = false;
            this.iniciarJuego();
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
     

     

    

        

           
                
            

        

    

     