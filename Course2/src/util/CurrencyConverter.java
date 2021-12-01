package util;


public class CurrencyConverter {	
	
	public final double IOF = 6;	
	public double quantity;
	public double real = 1.00;
	public double dollarvalue = 5.61;
	
	public double dollarconvert(){
		return dollarvalue * quantity;
	}	
	
	public double realvalue() {
		return real * dollarvalue * quantity + (dollarconvert() * IOF/100);
	}
	
	public double ioftax() {
		return dollarconvert() * IOF/100;
	}
	
}