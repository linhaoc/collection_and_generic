package test1;
import java.util.*;

class Student implements Comparable<Student> {
	private int num;
	private String name;
	private double score;
	
	public Student(int num,String name,double score) {
		this.num = num;
		this.name= name;
		this.score = score;	
	}
	
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", score=" + score + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int result = score > o.score ? 1:(score == o.score ? 0 : -1);
		if(0 == result) {
			result = name.compareTo(o.name);
		}
		return result;
	}
}
public class TreeSet_test {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();
		set.add(new Student(10,"lucy",80));
		set.add(new Student(13,"john",90));
		set.add(new Student(12,"mary",80));
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

