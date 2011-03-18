package src.kata.cardchecker;

public class CreditCardChecker {

	
	public boolean isCardValid(String cardNumber) {
		String cardNumberWithoutSpaces = cardNumber.replaceAll(" ", "");
		CreditCardNumbersProcessor cardNumbersProcessor = new CreditCardNumbersProcessor(cardNumberWithoutSpaces);
		int[] doubledDigits = cardNumbersProcessor.getCardsDoubledDigits();
		int[] untouchedDigits = cardNumbersProcessor.getCardsUntouchedDigits();
		
		int summedDigits = cardNumbersProcessor.getDigitwiseSum(untouchedDigits) + cardNumbersProcessor.getDigitwiseSum(doubledDigits);
		return isCardValidBasedOnDigits(summedDigits);
	}

	private boolean isCardValidBasedOnDigits(int summedDigits) {
		return summedDigits % 10 == 0;
	}

}
