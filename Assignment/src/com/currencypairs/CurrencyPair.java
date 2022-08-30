package com.currencypairs;

import java.time.LocalTime;
import java.util.ArrayList;


public class CurrencyPair {
	 String Ccy1;
	private String Ccy2;
	private String spotdays;
	private String WeekendDays;
	private String Precision;
	private String LastUpdatedTime;
	private LocalTime lt;              //Localtime variable to store time
	
	
	public CurrencyPair(String ccy1, String ccy2, String spotdays, String weekendDays, String precision,
			String lastUpdatedTime) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		this.spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
		this.lt = LocalTime.parse(lastUpdatedTime.replaceAll("-", ":"));        //string type time is stored in localtime
		
	}
	
	
	public CurrencyPair() {
		
	}


	@Override
	public String toString() {
		return "CurrencyPair [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", spotdays=" + spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + lt + "]";
	}
	public String getCcy1() {
		return Ccy1;
	}
	public LocalTime getLt() {
		return lt;
	}


	public String getCcy2() {
		return Ccy2;
	}
	public String getSpotdays() {
		return spotdays;
	}
	public String getWeekendDays() {
		return WeekendDays;
	}
	public String getPrecision() {
		return Precision;
	}
	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	
	public void sortByCurrency(ArrayList<CurrencyPair> ab){  //method to sort based on currency pairs
		ab.sort((CurrencyPair d1,CurrencyPair d2) -> ((d1.getCcy1()+d1.getCcy2()).compareTo(d2.getCcy1()+d2.getCcy2())));
	}
	public void sortByLastUpdatedTime(ArrayList<CurrencyPair> ab){  //method to sort based on localupdatedtime
		ab.sort((CurrencyPair d1,CurrencyPair d2) -> (d1.getLt().compareTo(d2.getLt())));
	}
}



