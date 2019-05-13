package test6;

import java.util.*;

class person{
	private String name;
	private int age;
	public person (String name ,int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object o) {
		if(o instanceof person) {
			person p = (person) o;
			return (name.equals(p.name))&&(age==p.age);
		}
		return super.equals(o);
	}
	
	//覆盖hashCode()方法，保证两个相等的person对象的哈希码也一样 (若该方法注释，将会得到错误结果)
	public int hashCode() {
		int i;
		i = (name==null ? 0 : name.hashCode());
		i = 15 * i + age;
		return i;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

}
//HashSet不能添加重复的元素，当调用add（Object）方法时候，
//首先会调用Object的hashCode方法判hashCode是否已经存在，如不存在则直接插入元素；
//如果已存在则调用Object对象的equals方法判断是否返回true，如果为true则说明元素已经存在，如为false则插入元素。
public class HashSet_test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
	
		HashSet s = new HashSet();
		s.add(new person("jack",20));
		s.add(new person(new String("jack"),20));
		s.add(new person("marry",20));
		s.add(new person("josn",19));
		s.add(new person("tom",19));
		System.out.println(s.size());
		System.out.println(s);

		s.remove(new person("marry",20));
		System.out.println(s.remove(new person("jack",20)));
		
		System.out.println(s.size());
		System.out.println(s);

	
	}
}
