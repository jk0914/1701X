package com.jiangkuo.common.test;

import java.util.Date;

import org.junit.Test;

import com.jiangkuo.common.utils.DateUtil;

public class DateTest {
	@Test
	public void testGetDateByInitMonth() {
		String initMonth = DateUtil.getDateByInitMonth(new Date());
		System.out.println(initMonth);
	}
	
	@Test
	public void testGetDateByFullMonth() {
		String fullMonth = DateUtil.getDateByFullMonth(new Date());
		System.out.println(fullMonth);
	}
	
	@Test
	public void test() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";	
		String string = sql.replace("{1}", DateUtil.getDateByInitMonth(new Date())).replace("{2}", DateUtil.getDateByFullMonth(new Date()));
		System.out.println(string);
	}
}
