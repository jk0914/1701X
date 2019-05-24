package com.jiangkuo.common.test;

import java.io.File;

import org.junit.Test;

import com.jiangkuo.common.utils.FileUtil;

public class FileTest {
	@Test
	public void testGetExtendName() {
		String string = FileUtil.getExtendName("aaa.jpg");
		System.out.println(string);		
	}
	
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file.getPath());
	}
	
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file.getPath());
	}
}
