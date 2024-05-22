package CuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {
	private CuentaBancaria cuenta;
	
	@BeforeEach // configura estado inicial antes de cada test
	public void setUp() {
		cuenta = new CuentaBancaria("Peter","56642563F", "12345678901234567890");
	}
	
	@Test
	public void testDepositarCantidadValida() {

		cuenta.depositar(100);
		assertEquals(100, cuenta.consultarSaldo(), "El saldo debe ser 100");
		

	}
	
	@Test
    public void testDepositarCantidadNoValida() {
        cuenta.depositar(-100.0);
        assertEquals(0.0, cuenta.consultarSaldo(), "El saldo debe ser 0.0 cuando se intenta depositar una cantidad negativa");
    }

}
