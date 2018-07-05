import java.util.Scanner;


public class Transaccion{
//    Fondo fondo = new Fondo();
//    static int resultado;
      protected static int fondoUsuario = 10000;
      protected static int fondoAtm = 100000;




        protected void ActualizarFondos() throws Exception{
            Transaccion transaccion = new Transaccion();
            Scanner sc = new Scanner(System.in);

            //Cualquier número diferente de 1 si el ATM esta atrabancado, 1 si no lo está
            int x = 1;

            if(x == 1){
                System.out.println("Inserte la cantidad de dinero que desea depositar en el compartimiento");
                int deposito = sc.nextInt();

                fondoUsuario += deposito;
//                resultado = fondo.getFondoBalance() + deposito;
//                fondo.setFondoBalance(resultado);

                System.out.println("Su nuevo fondo esta siendo imprimido.");
                System.out.println(fondoUsuario);
//                System.out.println(fondo.getFondoBalance());
                System.out.println(" ");

                transaccion.realizarOtra();
            }
            else{
                System.out.println("Temporalmente no se pueden realizar depósitos.");
                transaccion.realizarOtra();
            }
        }


        protected void VerificarFondos() throws Exception{
            Transaccion transaccion = new Transaccion();
            Scanner sc = new Scanner(System.in);

            //Cualquier número diferente de 1 si el ATM esta atrabancado, 1 si no lo está
            int x = 1;

            if(x == 1){
                System.out.println("Inserte la cantidad de dinero que desea retirar  de la  cuenta. El monto de su retiro debe ser múltiplo de 10");
                int retirar = sc.nextInt();
                System.out.println(" ");

                if(retirar <= fondoAtm){
                    if(retirar > fondoUsuario || retirar == 0){
                        System.out.println("Balance insuficiente. No puede retirar esa cantidad de dinero");
                        transaccion.realizarOtra();

                    } else if(retirar % 10 == 0){
                        fondoUsuario -= retirar;
                        System.out.println("Haz retirado " +retirar+" Su nuevo balance está siendo imprimido:");
                        System.out.println(fondoUsuario);
                        transaccion.realizarOtra();
                    }
                    else{
                        System.out.println("Solamente se puede retirar un monto que sea múltiplo de 10");
                        transaccion.realizarOtra();
                    }
                }
                else{
                    System.out.println("Lo sentimos, pero el monto que desea retirar no se encuentra disponible en este ATM");
                    transaccion.realizarOtra();
                }
            }
            else{
                System.out.println("Temporalmente no se pueden realizar retiros");
                transaccion.realizarOtra();
            }
        }

        protected void realizarOtra() throws Exception{
            System.out.println(" ");
            System.out.println("Desea realizar otra transacción??");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.println(" ");

            Scanner scs = new Scanner(System.in);
            int z = scs.nextInt();

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