package com.currencypairs;


import java.io.IOException;
import java.util.ArrayList;


public class CurrencySorting { //this class sorts data based on currency pair

	public static void main(String[] args) throws IOException {
		CsvFileReader cc = new CsvFileReader();
		ArrayList<CurrencyPair> currencydata = cc.csvFilereader();
		CurrencyPair currency = new CurrencyPair();  
		currency.sortByCurrency(currencydata);  //sorting the values using comparator based on currencypairs
		for(CurrencyPair dd : currencydata) {
			System.out.println(dd);
		}
	}

}
