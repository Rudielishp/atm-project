import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;




    public class Transaccion {

        private static final String FILENAME = "C:\\Users\\cesar\\Desktop\\Desktop2\\Fondos.txt";

        //static transaccion prueba = new transaccion();
//        public static void main(String[] args) throws Exception {
//            prueba.ActualizarFondos();
//        }

        protected void ActualizarFondos() throws Exception{
            Scanner sc = new Scanner(System.in);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            //0 si el ATM esta atrabancado, 1 si no lo está
            int x = 1;

            if(x == 1){
                System.out.println("Inserte la cantidad de dinero que desea depositar en el compartimiento");
                int deposito = sc.nextInt();

                String data = readFileAsString("C:\\Users\\cesar\\Desktop\\Desktop2\\Fondos.txt");

                int y = Integer.parseInt(data);

                y = y + deposito;

                System.out.println("Su nuevo balance esta siendo imprimido. Desea hacer otra transacción?");
                System.out.println(y);
                System.out.println(" ");

                String s = Integer.toString(y);

                BufferedWriter bw = null;
                FileWriter fw = null;

                try {
                    String content = s;
                    fw = new FileWriter(FILENAME);
                    bw = new BufferedWriter(fw);
                    bw.write(content);

                } catch (IOException e) {

                    e.printStackTrace();

                } finally {
                    try {
                        if (bw != null)
                            bw.close();

                        if (fw != null)
                            fw.close();

                    } catch (IOException ex){

                        ex.printStackTrace();
                    }
                }

                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.println(" ");

                Scanner scs = new Scanner(System.in);
                int z = sc.nextInt();

                switch(z){
                    case 1:

                        break;
                    case 2:
                        System.out.println("Por favor tome su recibo y su tarjeta ATM. Gracias!!");
                        break;
                }
            }
            else{
                System.out.println("Temporalmente no se pueden realizar depósitos. Desea realizar alguna otra transacción?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.println(" ");

                Scanner scs = new Scanner(System.in);
                int z = sc.nextInt();

                switch(z){
                    case 1:

                        break;
                    case 2:
                        System.out.println("Por favor tome su recibo y su tarjeta ATM. Gracias!!");
                        break;
                }
            }
        }

        private String readFileAsString(String fileName)throws Exception
        {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        }
    }
