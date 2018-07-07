import java.util.Scanner;

public class Menu {


    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Autentificar autentificar = new Autentificar();

        autentificar.comprobarAcceso();
        menu.seleccion();
    }

    protected void seleccion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int operacion;
        Transaccion transaccion = new Transaccion();

        System.out.println("Elija la transaccion que desea efectuar:\n");
        System.out.println("1- Ver Balance");
        System.out.println("2- Retirar Dinero");
        System.out.println("3- Depositar Dinero");

        operacion = scanner.nextInt();

        switch (operacion) {

            case 1:
                transaccion.VerificarBalance();
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


