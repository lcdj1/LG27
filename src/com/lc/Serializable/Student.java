package com.lc.Serializable;

import java.io.Serializable;

public class Student implements Serializable,Cloneable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name="Αυ΄Ο";
    int age=20;
    
    @Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
