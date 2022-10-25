
// ex 3 Binary to Decimal


int power(int base, int exponent) {
	// can use a for loop to keep timesing against the base (while a counter is less than a certain value)
	int result; // intialise someplace to keep a result
	for (int n = 0; n < exponent; n++) { // initialise a counter
		result = result * base;
	}
	return result;
}

int power2(int exponent) {
	int result = power(2, exponent); // calling the method above (note syntax)
	return result;	
}

// arithmetic to convert a binary number to decimal: addition of 2^current character of binary string


int binaryToDecimal(String binaryNumber) {
	int result = 0;
	int length = binaryNumber.length(); // the length of the string is needed to find a specific character within
	for (int n = length; n > 0; n--) {
		char binaryDigit = binaryNumber.charAt(n - 1); // n is equal to length here
		int bit = Integer.parseInt(binaryDigit); //parsing so we can times
		result = result + bit * power2(length - n);		
	}
	return result;
}

int decimalToBinary (String decimalNumber) {
	


}



