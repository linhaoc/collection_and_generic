package test7;

public class Student implements Comparable<Student>{
		private int num;
		private String name;

		public Student(int num,String name) {
			this.num = num;
			this.name= name;
		
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

		public int getnum() {
			return num;
		}
		public String getname() {
			return name;
		}
		
		@Override
		public String toString() {
			return "Student [num=" + num + ", name=" + name + "]";
		}
		//按学号从小到大排列
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.num-o.num;
			
		}

	}


