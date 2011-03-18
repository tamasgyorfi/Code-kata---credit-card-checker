package test.kata.cardchecker;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.kata.cardchecker.CreditCardNumbersProcessor;


public class CreditCardNumbersProcessorTest {

	CreditCardNumbersProcessor numbers = new CreditCardNumbersProcessor("4408041234567893");
	
	@Test
	public void shouldReturnEveryEvenIndexedNumberDoubled() throws Exception {
		assertArrayEquals(new int[]{8, 0, 0, 2, 6, 10, 14, 18}, numbers.getCardsDoubledDigits());
	}

	@Test
	public void shouldReturnEveryOddIndexedNumber() throws Exception {
		assertArrayEquals(new int[]{4, 8, 4, 2, 4, 6, 8, 3}, numbers.getCardsUntouchedDigits());
	}

	@Test
	public void shouldReturnDigitwiseSumOfArrays() throws Exception {
		assertEquals(31, numbers.getDigitwiseSum(new int[]{8, 0, 0, 2, 6, 10, 14, 18}));
	}

}
