package com.jiangkuo.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 日期处理类.返回指定日期的月初或月末
	 * @ClassName: DateUtil 
	 * @Description: TODO
	 * @author: 姜阔
	 * @date: 2019年5月17日 下午3:13:57
	 */
	// 根据传入的参数获取该日期的开始日期（1.1)
	public static String getDateByInitMonth(Date str) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//获取当前系统的Calendar对象
		Calendar calendar=Calendar.getInstance();
		//根据传入的日期初始化Calendar
		calendar.setTime(str);
		//让当前日期从1号开始
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		//获取日期类的日期格式化并返回
		Date time=calendar.getTime();
		return format.format(time);		
	}
	
	// 根据传入的参数获取该日期的结束日期（1.30）
		public static String getDateByFullMonth(Date str) {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//获取当前系统的Calendar对象
			Calendar calendar=Calendar.getInstance();
			//根据传入的日期初始化Calendar
			calendar.setTime(str);
			//让当前的月份+1
			calendar.add(Calendar.MONTH, 1);
			//设置当前月份的日期为上个月的最后一天
			calendar.set(Calendar.DAY_OF_MONTH, 0);
			calendar.set(Calendar.HOUR_OF_DAY,23);
			calendar.set(Calendar.MINUTE,59);
			calendar.set(Calendar.SECOND,59);
			//获取日期类的日期格式化并返回
			Date time=calendar.getTime();
			return format.format(time);		
		}
}
