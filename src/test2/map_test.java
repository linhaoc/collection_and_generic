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
		//�������ͬ��ѧ������
		Student s4 = new Student ("a",15);
		
		HashMap<Student, String> map = new HashMap<Student,String>();
		map.put(s1,"�㶫");
		map.put(s2,"�Ϻ�");
		map.put(s3,"����");
		map.put(s4,"����");
		
		//keyset����map�е�Ԫ��
		 //keySet():��ȡ���������еļ� 
		System.out.println("��keyset����map�е�Ԫ��");
		Set<Student> set = map.keySet();
		Set<Student> ts = new TreeSet<Student>();
		ts.addAll(set);
		Iterator<Student> it = ts.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu+" "+map.get(stu));
		}
		
		//��entryset����map�е�Ԫ��
		//ͨ��entrySet()������map�����е�ӳ���ϵȡ���������ϵ����Map.Entry���ͣ�
		System.out.println("��entryset����map�е�Ԫ��");
		Set<Entry<Student, String>> entries = map.entrySet();
		Set<Student> ts1 = new TreeSet<>();
		//��֤Ψһ�ȴ��treeset��
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
