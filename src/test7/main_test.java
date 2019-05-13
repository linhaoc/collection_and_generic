package test7;

import java.util.*;


class MyTool{
	
	// �Ƚ�������
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
    
	
	// ��Ȼ����
	public static <T extends Comparable> void sort(T[] list) {
			for (int i = 0; i < list.length; i++) {
				int index = i;
				for (int j = i; j < list.length; j++) {
					if (list[index].compareTo(list[j]) > 0) {
						index = j;
					}
				}
				// ʹ��ѡ������
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
		Student [] stu = {new Student(1,"��һ"),new Student(5,"����") ,new Student(3,"����")};
		Teacher [] tea = {new Teacher(203,"����ʦ"),new Teacher(201,"����ʦ")};
		for(int i=0;i<stu.length;i++) {
			System.out.print(stu[i]+"  ");
		}
		System.out.println();
		
		for(int i=0;i<tea.length;i++) {
			System.out.print(tea[i]+"  ");
		}
		System.out.println();
		
		//��Ȼ����
		MyTool mt = new MyTool();
		mt.sort(stu);	
		for(int i=0;i<stu.length;i++) {
			System.out.print(stu[i]+"  ");
		}
		System.out.println();
		
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
		for(int i=0;i<tea.length;i++) {
			System.out.print(tea[i]+"  ");
		}
	}

	
}
