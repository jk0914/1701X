package com.jiangkuo.common.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(String i){
		//TODO 实现代码
		InputStream in=new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		//TODO 实现代码
		OutputStream out=new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		return null;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		//TODO 实现代码
		Reader r=new Reader() {
			
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		return null;
	}

}
