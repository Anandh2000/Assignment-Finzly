package com.currencypairs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvFileReader {
	public ArrayList<CurrencyPair> csvFilereader() throws IOException {
		String path = "C:\\Users\\Finzly\\csv\\CurrencyPairs.csv";
		String l ;
		String[] line;
		ArrayList<CurrencyPair> currencydata = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(path));  //used to read csv file
		reader.readLine();
		while ((l = reader.readLine())!=null) {
			line = l.split(",");
			CurrencyPair data = new CurrencyPair(line[0],line[1],line[2],line[3],line[4],line[5]); //rows in csv file will be stored in the list
			currencydata.add(data);
		}
		return currencydata;
	}

	public static void main(String[] args) throws IOException {
		//this will search the currency pair and retrieve the data based on that
		CsvFileReader cc = new CsvFileReader();
		ArrayList<CurrencyPair> values = cc.csvFilereader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Currencypairs to retrive the data:");
		String currency = sc.next();
		String match = "false";    //variable to make sure whether the file contains the currency pair
		for (CurrencyPair ok : values) {
			if(currency.equals(ok.getCcy1()+ok.getCcy2())) {
				match = "true";
				System.out.println(ok); //displays the required currency pair values
			}
		}
		if(match.equals("false")) {
			System.out.println("Please provide the correct value");
		}
	}
}

