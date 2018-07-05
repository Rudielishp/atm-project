import java.util.Scanner;

public class Menu {




    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.seleccion();
    }

    protected void seleccion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int operacion = 0;
        Transaccion transaccion = new Transaccion();

        System.out.println("Elija la transaccion que desea efectuar:\n");
        System.out.println("1- Fondo");
        System.out.println("2- Retiro");
        System.out.println("3- Depositar");

        operacion = scanner.nextInt();

        switch (operacion) {

            case 1:

                break;

            case 2:
                transaccion.VerificarFondos();
                break;

            case 3:
                transaccion.ActualizarFondos();
                break;
        }

    }

}


