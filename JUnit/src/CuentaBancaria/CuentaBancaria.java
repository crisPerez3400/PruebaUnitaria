package CuentaBancaria;


public class CuentaBancaria {
	    private String nombreTitular;
	    private String dniTitular;
	    private String codigoCuenta;
	    private double saldo;

	    // Constructor
	    public CuentaBancaria(String nombreTitular, String dniTitular, String codigoCuenta) {
	        if (validarCCC(codigoCuenta)) {
	            this.nombreTitular = nombreTitular;
	            this.dniTitular = dniTitular;
	            this.codigoCuenta = codigoCuenta;
	            this.saldo = 0.0;
	        } else {
	            throw new IllegalArgumentException("Código de cuenta incorrecto");
	        }
	    }

	    // Métodos para mostrar información
	    public String mostrarNumeroCompleto() {
	        return codigoCuenta;
	    }

	    public String mostrarNombreTitular() {
	        return nombreTitular;
	    }

	    public String mostrarCodigoEntidad() {
	        return codigoCuenta;
	    }

	    public String mostrarCodigoSucursal() {
	        return codigoCuenta;
	    }

	    public String mostrarNumeroCuenta() {
	        return codigoCuenta;
	    }

	    public String mostrarDigitosControl() {
	        return codigoCuenta;
	    }

	    // metodos para operaciones 
	    public void depositar(double cantidad) {
	        if (cantidad > 0) {
	            saldo += cantidad;
	            System.out.println("Dinero depositado");
	        } else {
	            System.out.println("Cantidad no válida para depositar");
	        }
	    }

	    public void retirar(double cantidad) {
	        if (cantidad > 0 && cantidad <= saldo) {
	            saldo -= cantidad;
	            System.out.println("Dinero retirado");

	        } else {
	            System.out.println("Cantidad no válida o saldo insuficiente");
	        }
	    }

	    public double consultarSaldo() {
	        return saldo;
	    }

	    // Método auxiliar para validar CCC
	    private boolean validarCCC(String ccc) {
	        if (ccc.length() != 20) {
	            return false;
	        }
	      
	        return true;
	    }

}
