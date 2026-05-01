package first.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import first.model.Enrollment;

public class FileUtil implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static void save(List<Enrollment> list) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
			oos.writeObject(list);
		} catch(Exception e){
			System.out.println("Error saving file");
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static List<Enrollment> load(){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
			return (List<Enrollment>) ois.readObject();
		} catch(Exception e) {
			return new ArrayList<>();
		}
	}
	
}
