package lession19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Methods {
	public static void  serialize(File fileName, Object objectName) throws IOException, FileNotFoundException{
		FileOutputStream fileOutputStream=new FileOutputStream(fileName);
		ObjectOutputStream objectInputStream = new ObjectOutputStream(fileOutputStream);
		objectInputStream.writeObject(objectName);
		fileOutputStream.close();
		objectInputStream.close();
	 }
	public static Object deserealize (File fileName) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(fileName);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Serializable obj = (Serializable) objectInputStream.readObject();
		objectInputStream.close();
		fileInputStream.close();
		return obj;
		
	}
	
}
