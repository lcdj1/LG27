package com.lc.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;



public class Image {
    public static void main(String[] args) throws IOException {
         //Image.byt();
		 cha();
	}
    
    
    
    
    
    
    
    private static void cha() throws IOException {
        InputStream r=new FileInputStream("D:\\DB\\A.txt");
		//Reader r=new FileReader("D:\\DB\\A.txt");
		Writer w=new FileWriter("E:\\text\\C.txt",true);
		InputStreamReader i=new InputStreamReader(r,"utf-8");
		BufferedReader br=new BufferedReader(i);
		char [] c=new char[4096];
		int len=-1;
		while((len=i.read(c))!=-1) { 
			w.write(c,0,len);
		}
		w.flush();
		w.close();
		r.close();
	}







	//×Ö½ÚÁ÷
    public static void byt() throws IOException {
//		InputStream i=new FileInputStream("D:\\DB\\lc.png");
//		OutputStream o=new FileOutputStream("E:\\text\\lc.png",true);
//		byte [] b=new byte[4096];
//		int len=-1;
//		while((len=i.read(b))!=-1) {
//			o.write(b,0,len);
//		}
//		o.flush();
//		o.close();
//		i.close();
		
		InputStream i=new FileInputStream("D:\\DB\\A.txt");
		OutputStream o=new FileOutputStream("E:\\text\\B.txt",true);
		byte [] b=new byte[4096];
		int len=-1;
		while((len=i.read(b))!=-1) {
			o.write(b,0,len);
		}
		o.flush();
		o.close();
		i.close();
    }
}
