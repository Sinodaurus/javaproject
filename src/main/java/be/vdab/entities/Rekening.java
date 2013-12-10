package be.vdab.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Een rekening van een bank
 *
 * @author Sven
 *
 */
public class Rekening {
	private BigDecimal saldo = BigDecimal.ZERO;
	private Date creatie;
	/**
	 * Het saldo ophalen
	 * 
	 * @return het saldo
	 */
	public BigDecimal getSaldo(){
		return saldo;
	}
	
	public Date getCreatie() {
		return creatie;
	}
	public void setCreatie(Date creatie) {
		this.creatie = creatie;
	}
}
