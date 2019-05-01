package test5;

import java.util.*;

public class Iterator_test {
	public static void main(String[] args) {
		List<Student> lists= new ArrayList<Student>(Arrays.asList(new Student(12,"����",80.5),new Student(11,"����",85.6),new Student(13,"����",66.8)));
		System.out.println(lists);
		//���ɼ���������
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.getscore()>o2.getscore())
					return 1;
				else 
					return-1;
			}
		};
		//ʵ���۲���������
		Collections.sort(lists,c);
		//������
		Iterator it;
		it = lists.iterator();
		while(it.hasNext())
			System.out.print(it.next()+",  ");
		System.out.println();
		//��ѧ�Ŵ�С��������
		Collections.sort(lists);
		it = lists.iterator();
		it.forEachRemaining((obj)->System.out.print(obj+",  "));		
	}
}
