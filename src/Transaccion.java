import java.util.Scanner;


public class Transaccion {

    protected static int fondoUsuario = 10000;
    protected static int fondoAtm = 100000;

    public Transaccion(int operacion) {
        switch (operacion) {
            case 1:
                try {
                    VerificarBalance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case  2:
                try {
                    VerificarFondos();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    ActualizarFondos();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }

    protected void VerificarBalance() throws Exception {
        System.out.println("Su balance está siendo imprimido:");
        System.out.println("Su balance actual es de " + fondoUsuario);
        realizarOtra();
    }


    protected void ActualizarFondos() throws Exception {
        Scanner sc = new Scanner(System.in);

        //Cualquier número diferente de 1 si el ATM esta atrabancado, 1 si no lo está
        int x = 1;

        if (x == 1) {
            System.out.println("Inserte la cantidad de dinero que desea depositar en el compartimiento");
            int deposito = sc.nextInt();

            fondoUsuario += deposito;

            System.out.println("Su nuevo fondo esta siendo imprimido.");
            System.out.println("Su balance actual es de " + fondoUsuario);
            System.out.println(" ");

            realizarOtra();
        } else {
            System.out.println("Temporalmente no se pueden realizar depósitos.");
            realizarOtra();
        }
    }


    protected void VerificarFondos() throws Exception {
        Scanner sc = new Scanner(System.in);

        //Cualquier número diferente de 1 si el ATM esta atrabancado, 1 si no lo está
        int x = 1;

        if (x == 1) {
            System.out.println("Inserte la cantidad de dinero que desea retirar  de la  cuenta. El monto de su retiro debe ser múltiplo de 10");
            int retirar = sc.nextInt();
            System.out.println(" ");

            if (retirar <= fondoAtm) {
                if (retirar > fondoUsuario || retirar == 0) {
                    System.out.println("Balance insuficiente. No puede retirar esa cantidad de dinero");
                    realizarOtra();

                } else if (retirar % 10 == 0) {
                    fondoUsuario -= retirar;
                    System.out.println("Haz retirado " + retirar + " Su nuevo balance está siendo imprimido:");
                    System.out.println("Su balance actual es de " + fondoUsuario);
                    realizarOtra();
                } else {
                    System.out.println("Solamente se puede retirar un monto que sea múltiplo de 10");
                    realizarOtra();
                }
            } else {
                System.out.println("Lo sentimos, pero el monto que desea retirar no se encuentra disponible en este ATM");
                realizarOtra();
            }
        } else {
            System.out.println("Temporalmente no se pueden realizar retiros");
            realizarOtra();
        }
    }

    protected void realizarOtra() throws Exception {
        System.out.println(" ");
        System.out.println("Desea realizar otra transacción??");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.println(" ");

        Scanner scs = new Scanner(System.in);
        int z = scs.nextInt();

        switch (z) {
            case 1:
                Menu menu = new Menu();
                menu.seleccion();
                break;
            case 2:
                System.out.println("Por favor tome su recibo y su tarjeta ATM. Gracias!!");
                break;
        }
    }
}