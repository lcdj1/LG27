package com.lc.data;

import java.io.File;

import javax.swing.JFileChooser;

public class IOTest {
	public static void main(String[] args) {
		JFileChooser fc=new JFileChooser();
		int result=fc.showSaveDialog(null);
		File f=new File("");
	}
}
