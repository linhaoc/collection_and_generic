package test5;

public class Student implements Comparable<Student> {
	private int num;
	private String name;
	private double score;
	public Student(int num,String name,double score) {
		this.num = num;
		this.name= name;
		this.score = score;	
	}
	public Student() {
		// TODO Auto-generated constructor stub
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
		return "{ѧ��:"+num+"   ����:" +name+"   �ۺϳɼ�:"+score+"}";
	}
	//��ѧ�Ŵ�С��������
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
 		return this.num-o.num;

	}

}
