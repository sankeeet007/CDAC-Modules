package second.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import second.model.Student;

public class FileUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void save(List<Student> list) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))){
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println("Error Saving File");
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Student> load(){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))){
			return (List<Student>) ois.readObject();
		} catch (Exception e) {
			return new ArrayList<Student>();
		}
	}
}
