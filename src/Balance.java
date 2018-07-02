public class Balance {

    private int cuentaBalance;

    public Balance(){
        cuentaBalance = 10000;
    }

    public void mostrarBalance() throws Exception {
        Transaccion ejecutador = new Transaccion();
        ejecutador.ActualizarFondos();
    }

}
