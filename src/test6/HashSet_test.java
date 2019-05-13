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
	
	//����hashCode()��������֤������ȵ�person����Ĺ�ϣ��Ҳһ�� (���÷���ע�ͣ�����õ�������)
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
//HashSet��������ظ���Ԫ�أ�������add��Object������ʱ��
//���Ȼ����Object��hashCode������hashCode�Ƿ��Ѿ����ڣ��粻������ֱ�Ӳ���Ԫ�أ�
//����Ѵ��������Object�����equals�����ж��Ƿ񷵻�true�����Ϊtrue��˵��Ԫ���Ѿ����ڣ���Ϊfalse�����Ԫ�ء�
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
