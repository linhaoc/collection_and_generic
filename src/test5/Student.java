package test5;

public class Student implements Comparable{
	private int num;
	private String name;
	private double score;
	public Student(int num,String name,double score) {
		this.num = num;
		this.name= name;
		this.score = score;	
	}
	public void setnum(int num) {
		this.num = num;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setscore(double score) {
		this.score = score;
	}
	public int getnum() {
		return num;
	}
	public String getname() {
		return name;
	}
	public double getscore() {
		return score;
	}
	@Override
	public String toString() {
		return "{学号:"+num+"   姓名:" +name+"   综合成绩:"+score+"}";
	}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

}
