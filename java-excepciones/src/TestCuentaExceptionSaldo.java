public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
//El metodo Main no puede tener un trows
        Cuenta cuenta = new CuentaAhorros(12,456);
        cuenta.deposita(200);
        try {
            cuenta.saca(210);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
    }
}
