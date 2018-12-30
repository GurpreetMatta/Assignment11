import java.util.ArrayList;
import java.util.Collections;

public class GeniticSort {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("Sonu");
		s.add("Gurpreet");
		s.add("Abhijot");
		Collections.sort(s);
		System.out.println(s);

		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(22);
		i.add(3);
		Collections.sort(i);
		System.out.println(i);
	}

}
