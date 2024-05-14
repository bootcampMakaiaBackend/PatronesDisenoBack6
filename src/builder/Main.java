package builder;

public class Main {
    public static void main(String[] args) {
        Cuenta cuentaMateo = new CuentaBuilder()
                .conNumeroCuenta(12312)
                .conNombreDueno("Mateo")
                .crear();
    }
}
