package com.jiangkuo.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/*
	* 方法1:
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	
	public static String getStart(String date){
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c= getCalendar(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		Date time=c.getTime();
		return f.format(time);
	}
	/*
	* 方法2：
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/

	public static String getEnd(String date) {
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c= getCalendar(date);
		c.add(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH,0);
		c.set(Calendar.HOUR_OF_DAY,23);
		c.set(Calendar.MINUTE,59);
		c.set(Calendar.SECOND,59);
		Date time=c.getTime();
		return f.format(time);
		
	}
	private static Calendar getCalendar(String date) {
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c=Calendar.getInstance();
		if(null!=date&&date.length()>0) {
			try {
				Date date2=f.parse(date);
				c.setTime(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return c;
	}

}
