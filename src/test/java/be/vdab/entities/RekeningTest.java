package be.vdab.entities;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RekeningTest {
	private Rekening rekening;
	@Before
	public void before(){
		rekening=new Rekening();
	}

	@Test
	public void getSaldo() {
		Assert.assertEquals(0,  BigDecimal.ZERO.compareTo(rekening.getSaldo()));
	}

}
