package test7;

import java.util.*;


class MyTool{
	public static <T> void sort(List<T> list, Comparator<? super T> c) {
            list.sort(c);
    }
	public static <T extends Comparable<? super T>> void sort(List<T> list) {
	        list.sort(null);
	    }
}
public class main_test {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>(Arrays.asList(new Student(1,"��һ"),new Student(5,"����") ,new Student(3,"����")));
		List<Teacher> tea = new ArrayList<Teacher>(Arrays.asList(new Teacher(203,"����ʦ"),new Teacher(201,"����ʦ")));
		System.out.println(stu);
		System.out.println(tea);
		MyTool mt = new MyTool();
		mt.sort(stu);
		System.out.println(stu);
		//�Ƚ���
		Comparator<Teacher> c = new Comparator<Teacher>() {
			
			@Override
			public int compare(Teacher t1, Teacher t2) {
				// TODO Auto-generated method stub
				if(t1.getTnum()-t2.getTnum()>0)
					return 1;
				else 
					return -1;
			}
		};
		mt.sort(tea,c);
		System.out.println(tea);
	}

	
}
