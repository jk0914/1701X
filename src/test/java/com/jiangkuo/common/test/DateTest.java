package com.jiangkuo.common.test;

import org.junit.Test;

import com.jiangkuo.common.utils.DateUtil;

public class DateTest {
	//测试类
	@Test
	public void test() {
		//测试月初时间
		String date="2019-05-18 11:37:22";
		String start = DateUtil.getStart(date);
		System.out.println(start);
	}
	
	@Test
	public void test2() {
		//测试末时间
		String date="2016-02-18 11:37:22";
		String end = DateUtil.getEnd(date);
		System.out.println(end);
	}
}
