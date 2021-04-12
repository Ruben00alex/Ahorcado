public class Ahorcado {

    private int conteoErrores;

    public Ahorcado() {
        conteoErrores = 1;
    }

    public void imprimirImagenAhorcado() {
        switch (conteoErrores) {
        case 1:
            System.out.println("|--------");
            System.out.println("|    \\O/");
            System.out.println("|     I");
            System.out.println("|     /\\");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;

        }

    }

    public int getConteoErrores() {
        return conteoErrores;
    }

}