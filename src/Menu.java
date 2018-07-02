import java.util.Scanner;

public class Menu {
    private Balance balance;

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.seleccion();
    }

    private void seleccion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int operacion = 0;
        System.out.println("Elija la transaccion que desea efectuar:\n");
        System.out.println("1- Balance");
        System.out.println("2- Retiro");
        System.out.println("3- Deposito");

        operacion = scanner.nextInt();

        switch (operacion){

        case 1:
            balance = new Balance();
            balance.mostrarBalance();
            break;

            case 3:

        }
    }

}


