package test2;
class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		  this.age = age;
	}
	public void setName(String name) {
		  this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(o instanceof Student) {
			Student stu = (Student) o;
			int num= this.name.compareTo(stu.name);
			if(num==0) {
				if(this.age>stu.age)
					return 1;
				if(this.age>stu.age)
					return 0;
				return -1;	
			}
				return num;
		}
		return 0;
	}
	
	
}
public class map_test {
	public static void main(String[] args) {
		
	}
}
