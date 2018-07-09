import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws Exception {
        Autentificar autentificar = new Autentificar();
        autentificar.comprobarAcceso();
    }

    protected void seleccion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int operacion;

        try {
            System.out.println("Elija la transaccion que desea efectuar:\n");
            System.out.println("1- Ver Balance");
            System.out.println("2- Retirar Dinero");
            System.out.println("3- Depositar Dinero");

            operacion = scanner.nextInt();
            Transaccion transaccion = new Transaccion(operacion);
        }
        catch (Exception e){
            System.out.println("Comando inválido. Inserte un número de los indicados..");
            seleccion();
        }
    }

}


