package in.cdac;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateClass {
	static String path;
	
	static public void setPath(String p) {
		path = p;
	}
	
	static public void getClass(String classname) {
		String str = classname.replace(".", File.separator);
		setPath(str);
		int index = str.lastIndexOf("\\");
		str = str.substring(0,index);
		System.out.println(str);
	
		File fileObj = new File("C:\\"+str);
		if(!fileObj.exists()) {
			fileObj.mkdirs();
		}
	}

	public static void generateClass(ArrayList<String> fieldsArrayList, ArrayList<String> methodsArrayList) {
		try (FileOutputStream fobj = new FileOutputStream("C:\\"+path+".java");
				PrintWriter pobj = new PrintWriter(fobj)) {
			
			pobj.println("package "+path.replace(File.separator, ".")+";");
			pobj.println();
			int ind = path.lastIndexOf('\\');
			String st = path.substring(ind+1);
			pobj.println("class " + st +"{");
			for(String tr:fieldsArrayList) {
				pobj.println(tr);				
			}
			for(String tr:methodsArrayList) {
				pobj.println(tr + "{\n}" );
			}
			pobj.println();
			pobj.println("}");
//			pobj.println(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
