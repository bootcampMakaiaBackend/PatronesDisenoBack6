package builder;

public class Cuenta {
    private int numeroCuenta;
    private String nombreDueno;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(int numeroCuenta, String nombreDueno, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreDueno = nombreDueno;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
}
