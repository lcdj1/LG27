package com.lc.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Car c=new Car();
		File f0 = new File("E:\\text\\C.my");
		FileOutputStream f = new FileOutputStream(f0);
		DataOutputStream d=new DataOutputStream(f);
		d.writeUTF(c.name);
        d.writeBoolean(c.run);
        d.writeInt(c.num);
        d.writeShort(c.count);
        d.flush();
        d.close();
        DataInputStream di=new DataInputStream(new FileInputStream(f0));
        String name=di.readUTF();
        boolean pd=di.readBoolean();
        int a=di.readInt();
        short s=di.readShort();
        System.out.println(a);
        System.out.println(s);
        System.out.println(pd);
        System.out.println(name);
        di.close();
	}

}
