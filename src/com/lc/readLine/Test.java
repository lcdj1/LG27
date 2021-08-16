package com.lc.readLine;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("E:\\text\\C.txt");
		InputStreamReader ir=new InputStreamReader(in);
		BufferedReader b=new BufferedReader(ir);
		OutputStream os=new FileOutputStream("E:\\text\\D.txt");
		String bs=null;
		while((bs=b.readLine())!=null) {
			os.write(("h"+bs+"\n").getBytes());
		}
		os.flush();
		os.close();
		b.close();
		ir.close();
		in.close();
		
	}
}
