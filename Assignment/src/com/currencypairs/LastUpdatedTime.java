package com.currencypairs;

import java.io.IOException;
import java.util.ArrayList;


public class LastUpdatedTime {
	// this class will sort the datas based on lastupdated time
	public static void main(String[] args) throws IOException { 
		CsvFileReader cc = new CsvFileReader();
		ArrayList<CurrencyPair> currencydatas = cc.csvFilereader(); 
		CurrencyPair c = new CurrencyPair();   
		c.sortByLastUpdatedTime(currencydatas);   //using comparator to sort the data based on lastupdated time
		for(CurrencyPair sortedValues : currencydatas) {
			System.out.println(sortedValues);       //print the sorted values
		}
	}

}
