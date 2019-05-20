package com.jiangkuo.common.test;

import java.io.InputStream;

import org.junit.Test;

import com.jiangkuo.common.utils.FileUtil;
import com.jiangkuo.common.utils.StreamUtil;

public class StreamTest {
	private static final String i = null;
	private InputStream txtFile;

	//测试StreamUtil工具类中readTextFile(输入文件文件参数)方法
	//并输出文件的内容
	@Test
	public void test() {
		StreamUtil.closeAll(i);
		
		System.out.println(i);
	}
	@Test
	public void test2() {
		StreamUtil.readTextFile(txtFile);
		
		System.out.println(txtFile);
	}
	
}
