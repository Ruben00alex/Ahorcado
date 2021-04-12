public class Ahorcado {

    
    public Ahorcado() {
        
    }

    public void imprimirImagenAhorcado(Jugador jugador) {
        switch (jugador.getConteoErrores()) {
        case 1:
            System.out.println("|--------");
            System.out.println("|    ");
            System.out.println("|    ");
            System.out.println("|   ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;

        case 2:
            System.out.println("|--------");
            System.out.println("|    😵");
            System.out.println("|     ");
            System.out.println("|    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;
        
        case 3:
            System.out.println("|--------");
            System.out.println("|    \\😵");
            System.out.println("|     ");
            System.out.println("|    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;

        case 4:
            System.out.println("|--------");
            System.out.println("|    \\😵 /");
            System.out.println("|     ");
            System.out.println("|    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;

        case 5:
            System.out.println("|--------");
            System.out.println("|    \\😵 /");
            System.out.println("|     👕");
            System.out.println("|    ");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;

        case 6:
            System.out.println("|--------");
            System.out.println("|    \\😵 /");
            System.out.println("|     👕");
            System.out.println("|     /");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;
        case 7:
            System.out.println("|--------");
            System.out.println("|    \\😵 /");
            System.out.println("|     👕");
            System.out.println("|     /\\");
            System.out.println("|        ");
            System.out.println("|        ");
            System.out.println("|        ");
            break;

        }

    }

    

}