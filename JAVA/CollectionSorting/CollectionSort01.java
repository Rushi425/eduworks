package sorting_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id; 
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {	
		return "s: " + id + " name: " + name;
//        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
	}
	// id wise sorting
//	@Override
//	public int compareTo(Student o) {
//		return this.id - o.id;
//	}
	
//	  name wise sorting
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}

public class CollectionSort01 {
	public static void main(String []args) {
//		List<Student> lst = new ArrayList<>();
////		student st = new student(0, "Rushi", 41);
//		lst.add(new Student(1, "Rushi", 21));
//		lst.add(new Student(9, "Sagar", 41));
//		lst.add(new Student(5, "Om", 24));
//		System.out.println(lst);
//		Collections.sort(lst);
//		System.out.println(lst);
		
		
		// name sorting
//		List<Student> lst = new ArrayList<>();
////		student st = new student(0, "Rushi", 41);
//		lst.add(new Student(1, "a", 21));
//		lst.add(new Student(9, "z", 41));
//		lst.add(new Student(5, "b", 24));
//		System.out.println(lst);
//		Collections.sort(lst);
//		System.out.println(lst);
		
		
		
//		List<Integer> lst1 = new ArrayList<>(Arrays.asList(1,23,456));		
//		List<Integer> lst1 = new ArrayList<>(List.of(1,23,0,456));
//		List<Integer> lst1 = List.of(1,2,3);
//		Collections.sort(lst1) ;
//		System.out.println(lst1);
	}
}
