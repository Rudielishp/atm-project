import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        for (int run = 0; run < 3; run++) {
            System.out.println("Ingrese su tarjeta");
            String acctNum = scanner.nextLine();
            System.out.println("Ingrese su PIN");
            String pwd = scanner.nextLine();

            String result = menu.checkID(acctNum, pwd);
            if (!result.equals("ERROR")) {
                break;
            } else if (run == 2) {// you cannot try to log in anymore than 3
                // times
                System.out.println("MAXIMO DE INTENTOS EXCEDIDO");
                return;
            }

        }
        menu.seleccion();
    }

    private BufferedReader readFileAsString(String fileName) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
        return bufferedReader;
    }

    private String checkID(String acctNum, String pwd) throws Exception {
        String result = "ERROR";
        BufferedReader data = readFileAsString("C:\\Users\\USER\\IdeaProjects\\atm-project\\credentiales\\usuario.txt");

        if (acctNum.contains(data.readLine()) && pwd.contains(data.readLine())) {
            result = "520.36";
        }

        System.out.println(result);
        return result;
    }

    protected void seleccion() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int operacion = 0;
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


