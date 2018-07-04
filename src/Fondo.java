public class Fondo {

    public int fondoBalance;

    public Fondo(){
        fondoBalance = 10000;
    }

    public void mostrarBalance() throws Exception {
        Transaccion ejecutador = new Transaccion();
        ejecutador.ActualizarFondos();
    }

    public int getFondoBalance() {
        return fondoBalance;
    }

    public void setFondoBalance(int fondoBalance) {
        this.fondoBalance = fondoBalance;
    }
}
