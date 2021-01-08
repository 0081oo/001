package com.kh.exam1;

import java.util.Date;
import java.util.Formatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Date Class
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.getTime()); //long형 데이터 반환
		System.out.printf("%tY년 ", today);
		System.out.printf("%tm월 ", today);
		System.out.printf("%td일 ", today);
		System.out.printf("%tH시 ", today);
		System.out.printf("%tM분 ", today);
		System.out.printf("%tS초\n", today);
		
		System.out.printf("%1$tY-%1$tm-%1$td\n", today);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("년도 : " + gc.get(Calendar.YEAR));
		System.out.println("월 : " + gc.get(Calendar.MONTH)+1);
		System.out.println("일 : " + gc.get(Calendar.DATE));
		System.out.println("시 : " + gc.get(Calendar.HOUR));
		System.out.println("분 : " + gc.get(Calendar.MINUTE));
		System.out.println("초 : " + gc.get(Calendar.SECOND));
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(new Date()));
		
		//FOrmatter
		Formatter f = new Formatter();
		String s = f.format("%1$tY-%1$tm-%1$td", today).toString();
		System.out.println(s);
		f.close();
	}

}
