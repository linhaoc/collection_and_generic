package test3;

import java.util.*;

class candidate {
	private int num;
	private String name;
	public candidate(int num ,String name) {
		this.num = num;
		this.name = name;
	}	
	
}
public class map_tset {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		//�����ѡ��
		candidate c1 = new candidate(1,"����");
		candidate c2 = new candidate(2,"����");
		candidate c3 = new candidate(3,"����");
		//����HashMap����
		map.put(1, 0);
		map.put(2,0);
		map.put(3,0);
	
		Scanner sc = new Scanner(System.in);
		System.out.print("������ʮ��ѡ���˵��ύ�ĺ�ѡ�˱��(�Կո����):");
		String temp = sc.nextLine();
		String []t = temp.split(" ");
		int []num = new int [20];
		for(int i=0;i<t.length;i++) {
			num[i]= Integer.parseInt(t[i]);
		}
		for(int i=0;i<num.length;i++) {
			Integer j = (Integer) map.get(num[i]);
			if(map.containsKey(num[i]))
				map.put(num[i],++j);
		}
		map.forEach((key,value)->System.out.println("��ѡ��"+key+"��Ʊ��Ϊ:"+value+" "));
	}
	
}
