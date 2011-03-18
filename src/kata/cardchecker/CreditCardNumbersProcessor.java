package src.kata.cardchecker;

public class CreditCardNumbersProcessor {

	private final String cardNumber;
	private int[] doubledDigits = null;
	private int[] untouchedDigits = null;

	public CreditCardNumbersProcessor(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	private void processCreditcardNumber() {
		int halfCreditCardNumberLength = cardNumber.length() / 2;
		
		untouchedDigits = new int[halfCreditCardNumberLength];
		doubledDigits =  new int[halfCreditCardNumberLength];
		
		for (int i = 0; i < halfCreditCardNumberLength; i++) {
			untouchedDigits[i] = getDigitAtindex(cardNumber, i * 2 + 1);
			doubledDigits[i] = getDigitAtindex(cardNumber, i * 2) * 2;
		}
	}

	private int getDigitAtindex(String cardNumber, int i) {
		return Integer.parseInt("" + cardNumber.charAt(i));
	}


	public int getDigitwiseSum(int[] numbers) {
		int sum = 0;
		for (int number:numbers) {
			if (number<10) {
				sum += number;
			} else {
				sum += number%10 + number/10;
			}
		}
		return sum;
	}

	public int[] getCardsDoubledDigits() {
		if (doubledDigits == null) {
			processCreditcardNumber();
		}
		return doubledDigits;
	}
	
	public int[] getCardsUntouchedDigits() {
		if (untouchedDigits == null) {
			processCreditcardNumber();
		}
		return untouchedDigits;
	}
}
