package test7;

import java.util.*;


class MyTool{
	
	// 比较器排序
	public static <T> void sort(T[] list, Comparator<? super T> c) {
		for (int i = 1; i < list.length; i++) {
			if (c.compare(list[i], (list[i - 1])) < 0) {
				T temp = list[i];
				int j = i;
				do {
					list[j] = list[j - 1];
					j--;
				} while (j > 0 && c.compare(list[i], (list[i - 1])) < 0);
				list[j] = temp;
			}
		}
	}
    
	
	// 自然排序
	public static <T extends Comparable> void sort(T[] list) {
			for (int i = 0; i < list.length; i++) {
				int index = i;
				for (int j = i; j < list.length; j++) {
					if (list[index].compareTo(list[j]) > 0) {
						index = j;
					}
				}
				// 使用选择排序
				if (index != i) {
					T temp = list[index];
					list[index] = list[i];
					list[i] = temp;
				}
			}
	    }
	
}
public class main_test {
	public static void main(String[] args) {
		Student [] stu = {new Student(1,"陈一"),new Student(5,"王五") ,new Student(3,"林三")};
		Teacher [] tea = {new Teacher(203,"陈老师"),new Teacher(201,"马老师")};
		for(int i=0;i<stu.length;i++) {
			System.out.print(stu[i]+"  ");
		}
		System.out.println();
		
		for(int i=0;i<tea.length;i++) {
			System.out.print(tea[i]+"  ");
		}
		System.out.println();
		
		//自然排序
		MyTool mt = new MyTool();
		mt.sort(stu);	
		for(int i=0;i<stu.length;i++) {
			System.out.print(stu[i]+"  ");
		}
		System.out.println();
		
		//比较器
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
		for(int i=0;i<tea.length;i++) {
			System.out.print(tea[i]+"  ");
		}
	}

	
}
