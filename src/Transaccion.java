import java.util.Scanner;


public class Transaccion{
//    Fondo fondo = new Fondo();
//    static int resultado;
      protected static int fondo = 10000;

        protected void ActualizarFondos() throws Exception{

            Scanner sc = new Scanner(System.in);
            Transaccion transaccion = new Transaccion();

            //Cualquier número diferente de 1 si el ATM esta atrabancado, 1 si no lo está
            int x = 1;

            if(x == 1){
                System.out.println("Inserte la cantidad de dinero que desea depositar en el compartimiento");
                int deposito = sc.nextInt();

                fondo += deposito;
//                resultado = fondo.getFondoBalance() + deposito;
//                fondo.setFondoBalance(resultado);

                System.out.println("Su nuevo fondo esta siendo imprimido.");
                System.out.println(fondo);
//                System.out.println(fondo.getFondoBalance());
                System.out.println(" ");

                transaccion.realizarOtra();
            }
            else{
                System.out.println("Temporalmente no se pueden realizar depósitos.");
                transaccion.realizarOtra();
            }
        }

        protected void realizarOtra() throws Exception{
            System.out.println("Desea realizar otra transaccion??");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.println(" ");

            Scanner scs = new Scanner(System.in);
            int z = scs.nextInt();

            switch(z){
                case 1:
                    Menu ejecutador = new Menu();
                    ejecutador.seleccion();
                    break;
                case 2:
                    System.out.println("Por favor tome su recibo y su tarjeta ATM. Gracias!!");
                    break;
            }
        }
    }


//    import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;

//       private static final String FILENAME = "C:\\Users\\cesar\\Desktop\\Desktop2\\Fondos.txt";
// String data = readFileAsString("C:\\Users\\cesar\\Desktop\\Desktop2\\Fondos.txt");
//
//        int y = Integer.parseInt(data);
//
//                y = y + deposito;
//
//                        System.out.println("Su nuevo fondo esta siendo imprimido. Desea hacer otra transacción?");
//                        System.out.println(y);
//                        System.out.println(" ");
//
//                        String s = Integer.toString(y);
//
//                        BufferedWriter bw = null;
//                        FileWriter fw = null;
//
//                        try {
//                        String content = s;
//                        fw = new FileWriter(FILENAME);
//                        bw = new BufferedWriter(fw);
//                        bw.write(content);
//
//                        } catch (IOException e) {
//
//                        e.printStackTrace();
//
//                        } finally {
//                        try {
//                        if (bw != null)
//                        bw.close();
//
//                        if (fw != null)
//                        fw.close();
//
//                        } catch (IOException ex){
//
//                        ex.printStackTrace();
//                        }
//                        }

//        private String readFileAsString(String fileName)throws Exception
//        {
//            String data = "";
//            data = new String(Files.readAllBytes(Paths.get(fileName)));
//            return data;
//        }