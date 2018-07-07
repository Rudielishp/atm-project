import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Autentificar {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    public void comprobarAcceso() {

        for (int run = 0; run < 3; run++) {
            System.out.println("Ingrese su tarjeta");
            String tarjeta = scanner.nextLine();
            System.out.println("Ingrese su PIN");
            String pin = scanner.nextLine();

            String result = null;
            try {
                result = verificarCredenciales(tarjeta, pin);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!result.equals("ERROR")) {
                break;
            } else if (run == 2) {
                System.out.println("MAXIMO DE INTENTOS EXCEDIDO");
                return;
            }
        }
        menu.seleccion();
    }

    private BufferedReader readFileAsString(String fileName) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }

    private String verificarCredenciales(String acctNum, String pwd) throws Exception {
        File file = new File(System.getProperty("user.dir"), "credentiales\\usuario.txt");
        String result = "ERROR";
        BufferedReader data = readFileAsString(file.toString());

        if (acctNum.contains(data.readLine()) && pwd.contains(data.readLine())) {
            result = "validado";
        }

        System.out.println(result);
        return result;
    }
}
