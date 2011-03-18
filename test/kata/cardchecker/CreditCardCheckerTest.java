package test.kata.cardchecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.kata.cardchecker.CreditCardChecker;

public class CreditCardCheckerTest {

	private static final String CREDIT_CARD_NUMBER = "4408 0412 3456 7893";
	CreditCardChecker cardChecker = new CreditCardChecker();
	
	@Test
	public void shouldReturnTrueForValidCreditCardNumber() {
		assertTrue(cardChecker.isCardValid(CREDIT_CARD_NUMBER));
	}
	
	@Test
	public void shouldReturnFalseForInvalidCreditCardNumber() {
		assertFalse(cardChecker.isCardValid("4409 0412 3456 7893"));
	}

}
