package com.jiangkuo.common.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.jiangkuo.common.utils.StreamUtil;

public class StreamTest {

	@Test
	public void testCloseAll() throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream("");
		FileInputStream inputStream2 = new FileInputStream("");
		StreamUtil.closeAll(inputStream,inputStream2);
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		File srcFile = new File("C:\\pic\\abc.txt");

		String string = StreamUtil.readTextFile(new FileInputStream(srcFile));
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		File srcFile = new File("C:\\pic\\abc.txt");
		String file = StreamUtil.readTextFile(srcFile);
		System.out.println(file);
	}

}
