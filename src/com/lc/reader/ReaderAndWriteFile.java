package com.lc.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderAndWriteFile {
	
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\text\\text.txt");	
		ReaderAndWriteFile.writerFile(f);
	}
	
    public static void writerFile(File f) throws IOException {
    	OutputStream o=new FileOutputStream(f,true);
    	InputStream i=new FileInputStream(f);
    	byte[] b = new byte[4096];
    	o.write("JAVA »ù´¡½Ì³Ì\n".getBytes());
    	o.write("100 \n".getBytes());
    	int len=-1;
    	StringBuffer sb=new StringBuffer();
    	while((len=i.read(b))!=-1) {
    		sb.append(new String(b,0,len));
    	}
    	System.out.println(sb);
    	o.flush();
    	o.close();
    	i.close();
    }
}
