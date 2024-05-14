package builder;

public class CuentaBuilder implements Builder{

    private int numeroCuenta;
    private String nombreDueno;
    private double saldo;
    private String tipoCuenta;

    public CuentaBuilder conNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public CuentaBuilder conNombreDueno(String nombreDueno){
        this.nombreDueno = nombreDueno;
        return this;
    }

    public CuentaBuilder conSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public CuentaBuilder conTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
        return this;
    }

    @Override
    public Cuenta crear() {
        //validaciones para el objecto
        //aca sehace el build del objecto de tipo Cuenta
        if(this.saldo < 0.0) {
            saldo = 0.0;
        }
        if(this.numeroCuenta == 0) {
            this.numeroCuenta = 1231231;
        }
        if(this.tipoCuenta == null) {
            this.tipoCuenta = "AHORROS";
        }
        return new Cuenta(this.numeroCuenta, this.nombreDueno, this.saldo, this.tipoCuenta);
    }
}
