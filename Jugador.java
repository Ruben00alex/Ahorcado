import java.util.ArrayList;

public class Jugador
{
    private int conteoErrores;
    private ArrayList<String> letrasCorrectas = new ArrayList<>();
    private ArrayList<String> letrasIncorrectas = new ArrayList<>();

    public Jugador(){

        conteoErrores = 0;
    }


public ArrayList<String> getLetrasCorrectas(){
    return letrasCorrectas;
}

public ArrayList<String> getLetrasIncorrectas(){
    return letrasIncorrectas;
}

public int getConteoErrores() {
        return conteoErrores;
    }

public void setConteoErrores(int numero) {
        conteoErrores = numero;
    }
}