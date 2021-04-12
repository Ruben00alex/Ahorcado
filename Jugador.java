public class Jugador
{
    private int conteoErrores;
    private ArrayList<String> letrasCorrectas = new ArrayList<String>();
    private ArrayList<String> letrasIncorrectas = new ArrayList<String>();
    
    public Jugador(){
        conteoErrores = 6;
    }



public int getConteoErrores() {
        return conteoErrores;
    }
}