package com.lc.file;

import java.io.File;
import java.io.IOException;



public class Test {
    public static void main(String[] args) throws IOException {
		File f=new File("E:\\text");
		File[] ff = f.listFiles();
//		if (f.exists()) {
//			System.out.println(f.delete());
//		} else {
//          System.out.println(f.createNewFile());
//		}
		if(!f.exists()) {
			f.createNewFile();
		}
//		System.out.println("�ļ�����:"+f.getName());
//		System.out.println("�ļ�·��:"+f.getPath());
//		System.out.println("�ļ�����·��:"+f.getAbsolutePath());
//		System.out.println("�ļ��Ƿ�ɶ�д"+f.canWrite());
//		System.out.println("�Ƿ���Ŀ¼:"+f.isDirectory());
//		System.out.println("�ļ�����:"+f.length()+"kb");
//		System.out.println(f.list()[0]);
//		System.out.println(f.listFiles()[0]);
//		for (File fe : ff) {
//			if(fe.getName().endsWith(".java")) {
//				System.out.println(fe.getAbsolutePath());
//			}
//		}
		
		System.out.println("----------------------------");
//		for (File file : ff) {
//			System.out.println(file.getAbsolutePath());
//			System.out.println(file.getName());
//			System.out.println(file.length()+"KB");
//		}
//		for (File file : ff) {
//			file.delete();
//		}
		Test.del(f);
		
	}
    
    public static void  del(File f) {
    	File [] ff=f.listFiles();
    	if(f.isDirectory()) {
    		for (File file : ff) {
				del(file);
			}
    	}
    	f.delete();
    }
}
