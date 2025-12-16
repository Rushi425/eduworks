package sorting_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	int id;
	String name;
	int age;
	
	public Students(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " +id+ " name: " +name;
	}

}

class IdCompare implements Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		return o1.id - o2.id;
	}
}
class NameCompare implements Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorSorting {
	public static void main(String []args) {
		List<Students> lst = new ArrayList<>();
		lst.add(new Students(1, "Rushi", 21));
		lst.add(new Students(9, "Sagar", 41));
		lst.add(new Students(5, "Om", 24));
		Collections.sort(lst, new IdCompare());
		System.out.println(lst);
	}
}
