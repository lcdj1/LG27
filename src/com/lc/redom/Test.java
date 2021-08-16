package com.lc.redom;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringJoiner;

public class Test {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("E:\\text\\D.txt", "rw");
		StringBuffer sb=new StringBuffer();
		String len = null;
		byte[] a="\n".getBytes();
		String b = new String(a);
		System.out.print(b);
		System.out.println(a[0]);
		
	    //System.out.println(new String(raf.readLine().getBytes("ISO-8859-1"),"gb2312"));
		while((len=raf.readLine())!=null) {
			sb.append(new String(len.getBytes("ISO-8859-1"),"gb2312"));
		}
		char[] c = sb.toString().toCharArray();
		char[] c1 = c.clone();
		int j = 0;
		for (int i = c.length-1; i >=0; i--,j++) {
			c1[j] = c[i];
		}
		System.out.println(new String(c1,0,c1.length));
		raf.close();

       
	}

}
