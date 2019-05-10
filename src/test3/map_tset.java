package test3;

import java.util.*;

class candidate{
	private int num;
	private String name;
	public candidate(int num ,String name) {
		this.num = num;
		this.name = name;
	}
}
public class map_tset {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(new candidate(1,"张三"), 0);
		map.put(new candidate(2,"李四"),0);
		map.put(new candidate(3,"王五"),0);
	
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要选举的人的编号如(1,2,3):");
			String temp = sc.nextLine();
			String []t = temp.split(",");
			int []num = null;
			for(int i=0;i<2;i++) {
				num[i]= Integer.parseInt(t[i]);
			}
		
		
	}
	
}
