import java.util.ArrayList;

public class Jugador
{
    private int conteoErrores;
    private ArrayList<String> letrasCorrectas = new ArrayList<>();
    private ArrayList<String> letrasIncorrectas = new ArrayList<>();

    public Jugador(){
        letrasCorrectas.add("p");
        letrasCorrectas.add("R");
        letrasCorrectas.add("e");
        letrasCorrectas.add("o");
        letrasCorrectas.add("l");

        conteoErrores = 6;
    }


public ArrayList<String> getLetrasCorrectas(){
    return letrasCorrectas;
}

public int getConteoErrores() {
        return conteoErrores;
    }
}