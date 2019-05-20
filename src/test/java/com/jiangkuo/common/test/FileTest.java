package com.jiangkuo.common.test;

import org.junit.Test;

import com.jiangkuo.common.utils.FileUtil;

public class FileTest {
	@Test
	public void test() {
		String fileName="aa.jpg";
		String name = FileUtil.getExtendName(fileName);
		System.out.println(name);
	}
	
	@Test
	public void test1() {
		String fileName="aa.jpg";
		String name = FileUtil.getExtendName(fileName);
		System.out.println(name);
	}
	
	@Test
	public void test2() {
		String fileName="aa.jpg";
		String name = FileUtil.getExtendName(fileName);
		System.out.println(name);
	}
}
