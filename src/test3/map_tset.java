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
		//定义候选人
		candidate c1 = new candidate(1,"张三");
		candidate c2 = new candidate(2,"李四");
		candidate c3 = new candidate(3,"王五");
		//创建HashMap对象
		map.put(1, 0);
		map.put(2,0);
		map.put(3,0);
	
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入十个选举人的提交的候选人编号(以空格隔开):");
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
		map.forEach((key,value)->System.out.println("候选人"+key+"号票数为:"+value+" "));
	}
	
}
