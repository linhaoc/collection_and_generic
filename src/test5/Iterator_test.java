package test5;

import java.util.*;

public class Iterator_test {
	public static void main(String[] args) {
		List<Student> lists= new ArrayList<Student>(Arrays.asList(new Student(12,"张三",80.5),new Student(11,"李四",85.6),new Student(13,"王五",66.8)));
		System.out.println(lists);
		//按成绩升序排列
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
		//实现综测升序排列
		Collections.sort(lists,c);
		//迭代器
		Iterator it;
		it = lists.iterator();
		while(it.hasNext())
			System.out.print(it.next()+",  ");
		System.out.println();
		//按学号从小到大排列
		Collections.sort(lists);
		it = lists.iterator();
		it.forEachRemaining((obj)->System.out.print(obj+",  "));		
	}
}
