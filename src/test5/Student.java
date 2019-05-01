package test5;

public class Student {
	private int num;
	private String name;
	private double score;
	public Student(int num,String name,double score) {
		this.name= name;
		this.num = num;
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
}
