package be.vdab.entities;

import java.math.BigDecimal;

/**
 * Een rekening van een bank
 *
 * @author Sven
 *
 */
public class Rekening {
	private BigDecimal saldo = BigDecimal.ZERO;
	/**
	 * Het saldo ophalen
	 * 
	 * @return het saldo
	 */
	public BigDecimal getSaldo(){
		return saldo;
	}
}
