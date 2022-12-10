package com.DauCungDuocHotel.Untils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	static SimpleDateFormat formater = new SimpleDateFormat();
	static String pattern = "dd/MM/yyyy";
	
	public static Date toDate(String date,String p) {
		try {
			formater.applyPattern(p);
			return formater.parse(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date toDate(String date) {
		try {
			formater.applyPattern(pattern);
			return formater.parse(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String toString(Date date,String p) {
		formater.applyPattern(p);
		return formater.format(date);
	}
	
	public static String toString(Date date) {
		formater.applyPattern(pattern);
		return formater.format(date);
	}
	
	public static Date addDays(Date date,long days) {
		date.setTime(date.getTime() + days*24*60*60*1000);
		return date;
	}
}
