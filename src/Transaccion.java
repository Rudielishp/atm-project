import java.util.Scanner;


public class Transaccion{
    Fondo fondo = new Fondo();


        protected void ActualizarFondos() throws Exception{

            Scanner sc = new Scanner(System.in);

            //Cualquier número diferente de 1 si el ATM esta atrabancado, 1 si no lo está
            int x = 1;

            if(x == 1){
                System.out.println("Inserte la cantidad de dinero que desea depositar en el compartimiento");
                int deposito = sc.nextInt();

                int resultado = fondo.getFondoBalance() + deposito;
                fondo.setFondoBalance(resultado);

                System.out.println("Su nuevo fondo esta siendo imprimido. Desea hacer otra transacción?");
                System.out.println(fondo.getFondoBalance());
                System.out.println(" ");

                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.println(" ");

                Scanner scs = new Scanner(System.in);
                int z = sc.nextInt();

                switch(z){
                    case 1:
                        Menu menu = new Menu();
                        menu.seleccion();
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
                        Menu ejecutador = new Menu();
                        ejecutador.seleccion();
                        break;
                    case 2:
                        System.out.println("Por favor tome su recibo y su tarjeta ATM. Gracias!!");
                        break;
                }
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