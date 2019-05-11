package test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		  this.age = age;
	}
	public void setName(String name) {
		  this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		Student stu = (Student) o;
		int  result = age > o.age ? 1:(age == o.age ? 0 : -1);
		if(result==0) {
			this.name.compareTo(o.name);
		}
		return result;
	}
	
	
	
}
public class map_test {
	public static void main(String[] args) {
		Student s1 = new Student ("a",15);
		Student s2 = new Student ("c",16);
		Student s3 = new Student ("b",17);
		//定义个相同的学生试试
		Student s4 = new Student ("a",15);
		
		HashMap<Student, String> map = new HashMap<Student,String>();
		map.put(s1,"广东");
		map.put(s2,"上海");
		map.put(s3,"北京");
		map.put(s4,"北京");
		
		//keyset遍历map中的元素
		 //keySet():获取集合中所有的键 
		System.out.println("用keyset遍历map中的元素");
		Set<Student> set = map.keySet();
		Set<Student> ts = new TreeSet<Student>();
		ts.addAll(set);
		Iterator<Student> it = ts.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu+" "+map.get(stu));
		}
		
		//用entryset遍历map中的元素
		//通过entrySet()方法将map集合中的映射关系取出（这个关系就是Map.Entry类型）
		System.out.println("用entryset遍历map中的元素");
		Set<Entry<Student, String>> entries = map.entrySet();
		Set<Student> ts1 = new TreeSet<>();
		//保证唯一先存进treeset中
		Iterator<Entry<Student, String>> it1 = 	entries.iterator();
		while(it1.hasNext()) {
			ts1.add(it1.next().getKey());
		}
		it = ts.iterator();
			while(it.hasNext()) {
				Student stu = it.next();
				System.out.println(stu+" "+map.get(stu));
			}
	}
}
