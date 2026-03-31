
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> objColor = new ArrayList<String>();
		objColor.add("Red");
		objColor.add("yellow");
		objColor.add("Blue");
		objColor.add("crimson");
		objColor.add("Purpal");
		objColor.add("White");
		objColor.add("Blue");
		objColor.add("crimson");
		objColor.add("Purpal");
		objColor.add("White");
		objColor.add("Black");
		objColor.add("skyblue");
		objColor.add("navyblue");

		// 2 add
		objColor.add(0, "green");

		// 3 get
		System.out.println(objColor.get(3));

		// 4.update at specific
		objColor.set(5, "Gray");

		// 5 remove
		objColor.remove(3);

		String Searchdata = "Yellow";

		// 6 Search element
		for (String data : objColor) {
			if (data.equalsIgnoreCase(Searchdata)) {
				System.out.println("search element");
				System.out.println(data);
				break;
			}
		}

		// 7 sort arraylist

		Collections.sort(objColor, String.CASE_INSENSITIVE_ORDER);

		// 8
		ArrayList<String> copyColor = new ArrayList<String>(objColor);

		// 9
		Collections.shuffle(objColor);
//		display(objColor);

		// 10 Reverse
		Collections.reverse(objColor);

		// 11 create tree set
		TreeSet<String> objset = new TreeSet<String>(Collections.reverseOrder());
		objset.add("red");
		objset.add("blue");
		objset.add("Yellow");

		// 12 add from another tree
		Set<String> obj = new TreeSet<String>(objset);

		// 13 Reverse
		System.out.println(objset);

		display(obj);

		// 14display last and first
		String first = objset.first();
		String last = objset.last();
		System.out.println(first);
		System.out.println(last);

		// Greater than or equal to
		TreeSet<Integer> objset2 = new TreeSet<Integer>();
		objset2.add(2);
		objset2.add(1);
		objset2.add(4);
		objset2.add(3);
		objset2.add(8);
		objset2.add(5);
		objset2.add(0);

		System.out.println(objset2.ceiling(6));

//		Display
//		display(objColor);

	}

	public static void display(ArrayList<String> copyColor) {
		System.out.println("\nDisplay ArrayList:");
		Iterator<String> iter = copyColor.iterator();

		while (iter.hasNext()) {
			String data = iter.next();
			System.out.println(data);
		}
	}

	public static void display(Set<String> copyColor) {
		System.out.println("\nDisplay Set:");
		Iterator<String> iter = copyColor.iterator();

		while (iter.hasNext()) {
			String data = iter.next();
			System.out.println(data);
		}
	}

}
